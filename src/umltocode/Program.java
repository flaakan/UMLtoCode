
package umltocode;

import java.util.ArrayList;
import java.util.List;


public class Program {
    private String name;
    List<Student> studentList;
    List<Seminar> seminarList;
    
    public Program(String name,List<Student> students, List<Seminar> seminars){
        this.name = name;
        this.studentList = students;
        seminarList = seminars;
    }

    public void addSeminar(Seminar seminar){
        seminarList.add(seminar);
    }
    
    public void getSeminars(){
        System.out.println("This program has these Seminars:");
        for(Seminar s : seminarList){
            System.out.println(s.getName());
        }
        System.out.println();
    }
    
    public String getName(){
        return name;
    }
     
    
    public void getStudents(){
        System.out.println("All students in this program");
        for(Student student : studentList){
            System.out.println(student.getName());
            
        }
        System.out.println();
    }
    
}