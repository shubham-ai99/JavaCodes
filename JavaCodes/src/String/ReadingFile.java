package String;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        // Another way to pass file
        File fileName =new File("C:/Users/gawad/Downloads/studentsystem/JavaCodes/src/file.txt.") ; // Replace with your file name

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                stringBuffer.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Contents of " + fileName + ":");
        System.out.println(stringBuffer.toString());
    }
}
