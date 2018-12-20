
package umltocode;

import java.util.ArrayList;
import java.util.List;

public class ProgramCoordinator {
    private String name;
    public List<Teacher> teacherList;
    Program program;

    public ProgramCoordinator(String name, Program program){
        this.name = name;
        this.program= program;
        teacherList = new ArrayList<>();
    }
    

    public void addTeacher(Teacher teacher){
        teacherList.add(teacher);
    }
    
    public void findTeacher(String s){
        for(Teacher teacher : teacherList){
            if(s.equalsIgnoreCase(teacher.getName())){
                System.out.println("Teacher found " + teacher.getName());
            }
        }
    }
}
