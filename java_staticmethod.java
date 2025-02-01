
class cse3{

    String name;
    int roll;
    static int class_room; 

    public static void allstudents(cse3 Student1){

        System.out.println(Student1.name + " " + Student1.roll + " " + class_room); // Only class_room is called directly because it is a static method
        // UnStatic method cant be called directily 

    }

}

public class java_staticmethod{
    public static void main(String args[]){

        cse3 Student1 = new cse3();
        Student1.name = "Swarup";
        Student1.roll = 190;
        cse3.class_room = 101;

        cse3 Student2 = new cse3();
        Student2.name = "Swatik";
        Student2.roll = 191;
        cse3.class_room = 101;

        cse3.class_room = 303; // 303 room no. will assign to all students

        cse3.allstudents(Student1); // Calling Student1 so that ststic method can acess unstatic method

       

    }
}