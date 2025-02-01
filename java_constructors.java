class user{
    String name;
    String password;

    public user(){ // constructor
        name = "Sahoo";    // If i dont assign value this will my default value this is called as a constructor
        password = "0987";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
public class java_constructors {
    public static void main(String[] args) {

        user User = new user();
        // User.name = "Swarup";
        // User.password = "1234";

        System.out.println(User.getName() + " " + User.getPassword());
        
    }    
}
