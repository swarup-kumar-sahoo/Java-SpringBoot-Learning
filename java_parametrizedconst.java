class students{
    private String name;
    private int roll;

    public students(){      // Its a default constructor 
        name = "Swatik";
        roll = 2202191;
    }

    public students(String name,int roll){  // Parameterized Constructor
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }



}
public class java_parametrizedconst {

    public static void main(String args[]){

        students Cse3 = new students("Swarup",2202190); // If we dont assign value here it will call default constructor
        System.out.println(Cse3.getName() + " " + Cse3.getRoll());

    }
    
}
