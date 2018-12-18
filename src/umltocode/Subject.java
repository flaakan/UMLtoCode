
package umltocode;


public class Subject {
    private String name;
    
    public Subject(String name){
        this.name = name;
    }
    
    public void viewSubjectInfo(){
        System.out.println(name);
    }
}
