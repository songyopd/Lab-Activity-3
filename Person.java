public class Person {

    private String name;
    private int id;
    
    //constructor
    public Person  (String name, int id) {
        this.name = name;
        this.id = id;

    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class SchoolTest {
        public static void main(String[] args) {
     
            Students student = new Students("Songyo", 108238, "First Year");
            student.displayInfo();
     
            Teacher teacher = new Teacher("SirChie", 0052, "OOP");
            teacher.displayInfo();
     
            Staff staff = new Staff("Jin Suarez", 0341, "SACE");
            staff.displayInfo();
        }
    }