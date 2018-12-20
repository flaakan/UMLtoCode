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
        System.out.println("Current seminar is: " + seminarList.get(seminarList.size()-1).getName()+"\n");
        
    }
    
    public void getSeminarHistory(){
        if(seminarList.size()>0){
            System.out.println(name + " has teached these Seminars");
            for(Seminar s : seminarList){
                System.out.println(s.getName());
           }
        }
        else{
            System.out.println(name + " has not teached any Seminars");
        }
        System.out.println();
    }
    
    public String getName(){
        return name;
    }
}
