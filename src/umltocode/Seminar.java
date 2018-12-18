package umltocode;


import java.util.ArrayList;
import java.util.List;

public class Seminar {
    
    protected String name;
    List<Attendance> attendances;
    List<Subject> subjects;
    Teacher teacher;
    
    public Seminar(String name, Teacher teacher)
    {
        this.name = name;
        this.teacher = teacher;
        attendances = new ArrayList<>();
        subjects =  new ArrayList<>();
        
    }
    
    public void addAttendance(Attendance attendance)
    {
        attendances.add(attendance);
    }
    
    public void getTotalAttendance()
    {
        System.out.println(attendances.size());
    }
    
    public Seminar getSeminar(){
        return this;
    }
    public String getName(){
        return name;
    }
}
