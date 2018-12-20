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
        if(attendances.size() ==1)
            System.out.println(name + " has attended " + attendances.size() + " seminar\n");
        else
            System.out.println(name + " has attended " + attendances.size() + " seminars\n");
        
    }
    
    public void attendSeminar(Attendance attendance)
    {
        attendances.add(attendance);
    }
    public String getName(){
        return name;
    }
}
