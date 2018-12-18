package umltocode;

import java.util.ArrayList;
import java.util.List;


public class Student {
    private String name;
    List<Attendance> attendances = new ArrayList<>();
    
    public Student()
    {}
    
    public void getSeminarsAttended()
    {
        System.out.println(attendances.size());
    }
    
    public void attendSeminar(Attendance attendance)
    {
        attendances.add(attendance);
    }
    public String getName(){
        return name;
    }
}
