class csds{
    private String name_ds; 
    private int roll_ds;

    // Getters and Setters
    public String getName_ds() {  // Getting the name
        return name_ds;
    }

    public void setName_ds(String name_ds) { // Setting the name
        this.name_ds = name_ds;
    }

    public int getRoll_ds() { // Getting the roll
        return roll_ds;
    }

    public void setRoll_ds(int roll_ds) { // Setting the roll
        this.roll_ds = roll_ds;
    }


    
    }

public class getter_setter {

    public static void main(String[] args) {

        csds cds = new csds();
        cds.setName_ds("Abhinas"); 
        cds.setRoll_ds(2205002);
        System.out.println(cds.getName_ds() + " " + cds.getRoll_ds());
 
    }
    
}
