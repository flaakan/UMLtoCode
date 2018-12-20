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
        this.teacher.addSeminar(this);
        
    }
    
    public void addAttendance(Attendance attendance)
    {
        attendances.add(attendance);
    }
    
    public void addSubject(Subject sub){
        subjects.add(sub);
    }
    
    public void getTotalAttendance()
    {
        System.out.println(attendances.size() + " is the total attendance for " + name +"\n");
    }
    
    public Seminar getSeminar(){
        return this;
    }
    public String getName(){
        return name;
    }
    
    public void printSubjects(){
        System.out.println("This seminar has the subjects:");
        for(Subject s : subjects){
            s.viewSubjectInfo();
        }
        System.out.println();
    }
}
