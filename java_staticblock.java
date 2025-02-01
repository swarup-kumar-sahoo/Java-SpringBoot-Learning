
class cse3{

    String name;
    int roll;
    static int class_room; 

    static {    
        // Ststic block
        class_room = 303;
    }

    public cse3(){         // This value became default if i dont assign value to any instance variable
        name = "Subham";
        roll = 175;
    }

    public void allstudents(){

        System.err.println(name + " " + roll + " " + " " + class_room);

    }
}
public class java_staticblock {

    public static void main(String[] args) {
        
        cse3 Student1 = new cse3();
        Student1.name = "Swarup";
        Student1.roll = 190;
        cse3.class_room = 101;

        cse3 Student2 = new cse3(); // Use  cse3()
        cse3 Student3 = new cse3(); // Use  cse3()
        Student1.allstudents();
        Student2.allstudents();
        Student3.allstudents();


    }
    
}
