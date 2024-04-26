package com.arjuncodes.studentsystem.controller;


import com.arjuncodes.studentsystem.Service.StudentService;
import com.arjuncodes.studentsystem.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("/app")
    public String add(@RequestBody Student student) {

        studentService.saveStudent(student);
        return " new student is added ";
    }

    @GetMapping("/app/getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }


    @PutMapping(value= "/app/update/{id}")
    public ResponseEntity<Student> updateItem(@PathVariable int id, @RequestBody Student updateItem){
        System.out.println(id);
        System.out.println(updateItem.getName());
        System.out.println(updateItem.getAddress());

        updateItem.setId(id);
        return ResponseEntity.ok(updateItem);
    }

    @DeleteMapping("/app/{id}")
    public ResponseEntity<?> deleteItem(@PathVariable int id) {
        try {
            studentService.deleteItem(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error deleting item");

        }
    }

}