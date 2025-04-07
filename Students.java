public class Students extends Person {
 
     private String gradeLevel;
    
    
    //Constructor
     public Students (String name, int id, String gradeLevel)  {
        super(name, id);
        this.gradeLevel = gradeLevel;
     }

     @Override
     public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade Level: " + gradeLevel);
    
    }
    
}
