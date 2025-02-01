class cse3{

    String name;
    int roll;
    static int class_room; // We use static to make a common value that assign to all

    public void allstudents(){

        System.err.println(name + " " + roll + " " + " " + class_room);

    }

}
public class java_static{
    public static void main(String[] args) {

        cse3 Student1 = new cse3();
        Student1.name = "Swarup";
        Student1.roll = 190;
        cse3.class_room = 101;

        cse3 Student2 = new cse3();
        Student2.name = "Swatik";
        Student2.roll = 191;
        cse3.class_room = 101;

        cse3.class_room = 303; // 303 room no. will assign to all students

        Student1.allstudents();
        Student2.allstudents();

    }
}