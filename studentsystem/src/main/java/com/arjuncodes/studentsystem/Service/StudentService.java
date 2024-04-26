package com.arjuncodes.studentsystem.Service;

import com.arjuncodes.studentsystem.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

    public void deleteItem(int id);

    public void updateItem(Student student);



}
