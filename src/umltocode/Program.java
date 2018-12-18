
package umltocode;

import java.util.ArrayList;
import java.util.List;


public class Program {
    private String name;
    List<Student> studentList;
    
    public Program(String name,List<Student> students){
        this.name = name;
        this.studentList = students;
    }

    public void getStudents(){
        for(Student student : studentList){
            System.out.println(student.getName());
            
        }
    }
}