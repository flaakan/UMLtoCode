package umltocode;

import java.util.ArrayList;


public class UMLtoCode {

 
    public static void main(String[] args) {
        
        ArrayList<Student> studentList = new ArrayList<>();
        
        
        Program p1 = new Program("Java",studentList);
        Student s1 = new Student("Johnny");
        Student s2 = new Student("Kenny");
        studentList.add(s1);
        studentList.add(s2);
        
        ProgramCoordinator pc = new ProgramCoordinator("Coord",p1);
        
        
        Teacher t1 = new Teacher("lärare 1");
        Teacher t2 = new Teacher("lärare 2");
        pc.addTeacher(t1);
        pc.addTeacher(t2);
        pc.findTeacher("lärare 1");
        Attendance attend = new Attendance();
        
        Subject sub1 = new Subject("Pyte sats");
        Subject sub2 = new Subject("Addition");
        
        
        Seminar matte1 =new Seminar("Matte1",t1);
        Seminar matte2 = new Seminar("Matte2",t1);
        
        matte1.addSubject(sub1);
        matte1.addSubject(sub2);

        
        attend.registerAttendance(matte1, s1);
        attend.registerAttendance(matte1, s2);
        
        s1.getSeminarsAttended();
        
        matte1.getTotalAttendance();
        
        matte1.printSubjects(); 
        
        t1.getCurrentSeminar();
        
        t1.getSeminarHistory();
        
        p1.getStudents();
        
        
    }
    
}
