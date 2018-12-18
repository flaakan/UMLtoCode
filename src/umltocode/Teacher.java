package umltocode;

import java.util.ArrayList;
import java.util.List;


public class Teacher {
    private String name;
    ArrayList<Seminar> seminarList = new ArrayList<>();
    
    
    
    public void addSeminar(Seminar seminar){
        seminarList.add(seminar);
    }
    
    
    
    public Seminar getCurrentSeminar(){
        return seminarList.get(seminarList.size()-1);
        
    }
    
    public List<Seminar> getSeminarHistory(){
       return seminarList;
    }
    
    public String getName(){
        return name;
    }
}
