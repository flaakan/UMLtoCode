
package umltocode;

import java.util.ArrayList;
import java.util.List;

public class ProgramCoordinator {
    private String name;
    public List<Teacher> teacherList;

    public ProgramCoordinator(String name){
        this.name = name;
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
