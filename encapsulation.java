
class csds{
    private String name_ds; // It will only accessed in this class only
    private int roll_ds;

    public String getName(){ // Getting name
        return name_ds;
    }

    public void setName(String nds){ // Setting name

        // We can assign the value through this method
        name_ds = nds;

    }

    public int getRoll(){ // Getting the roll number
        return roll_ds;
    }

    public void setRoll(int rds){ // Setting the roll number
        roll_ds = rds;
    }
}

public class encapsulation {

    public static void main(String[] args) {
        
        csds cds = new csds();
        cds.setName("Abhinas"); // Assigning value throuh methods
        cds.setRoll(2205002);
        System.out.println(cds.getName() + " " + cds.getRoll());
 
    }
    
}
