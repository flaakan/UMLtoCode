package umltocode;

import java.util.ArrayList;
import java.util.List;


public class Student {
    private String name;
    List<Attendance> attendances;
    
    public Student(String name)
    {
        this.name=name;
        attendances = new ArrayList<>();
    }
    
    public void getSeminarsAttended()
    {
        System.out.println(attendances.size() + " attended");
    }
    
    public void attendSeminar(Attendance attendance)
    {
        attendances.add(attendance);
    }
    public String getName(){
        return name;
    }
}
