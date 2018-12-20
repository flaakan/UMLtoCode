package umltocode;

import java.util.ArrayList;


public class UMLtoCode {

 
    public static void main(String[] args) {
        
        Attendance attend = new Attendance();
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Seminar> seminarList = new ArrayList<>();
        
        
        Program p1 = new Program("Java",studentList,seminarList);
        ProgramCoordinator pc = new ProgramCoordinator("Coord",p1);
        
        Teacher t1 = new Teacher("lärare 1");
        Teacher t2 = new Teacher("lärare 2");
        pc.addTeacher(t1);
        pc.addTeacher(t2);
        pc.findTeacher("lärare 1");
        
        Student s1 = new Student("Johnny");
        Student s2 = new Student("Kenny");
        studentList.add(s1);
        studentList.add(s2);
        p1.getStudents();

        Seminar matte1 =new Seminar("Matte1",t1);
        Seminar matte2 = new Seminar("Matte2",t1);
        seminarList.add(matte1);
        seminarList.add(matte2);
        p1.getSeminars();
             
        Subject sub1 = new Subject("Pyte sats");
        Subject sub2 = new Subject("Addition");     
        matte1.addSubject(sub1);
        matte1.addSubject(sub2);

        
        
        
        attend.registerAttendance(matte1, s1);
        attend.registerAttendance(matte1, s2);
        attend.registerAttendance(matte2, s2);
        
        s1.getSeminarsAttended();
        s2.getSeminarsAttended();
        
        matte1.getTotalAttendance();
        matte1.printSubjects(); 
        
        matte2.getTotalAttendance();
        
        t1.getCurrentSeminar();
        
        t1.getSeminarHistory();
        

        
        
    }
    
}
