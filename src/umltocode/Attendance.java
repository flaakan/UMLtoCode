package umltocode;


public class Attendance {
    
    
    protected int attendanceLevel;
    
    public Attendance()
    {
        
    }
    
    public void registerAttendance(Seminar seminar, Student student)
    {
        student.attendSeminar(this);
        seminar.addAttendance(this);
        
    }
    
    public void removeAttendance(Seminar seminar, Student student)
    {
       
    }
}