package umltocode;

import java.util.ArrayList;
import java.util.List;


public class Teacher {
    private String name;
    ArrayList<Seminar> seminarList;
    
    public Teacher(String name){
        this.name=name;
        seminarList = new ArrayList<>();
    }
    
    public void addSeminar(Seminar seminar){
        seminarList.add(seminar);
    }
    
    
    
    public void getCurrentSeminar(){
        System.out.println("Current seminar: " + seminarList.get(seminarList.size()-1).getName());
        
    }
    
    public void getSeminarHistory(){
       for(Seminar s : seminarList){
           System.out.println(s.getName());
       }
    }
    
    public String getName(){
        return name;
    }
}
