

class login{

    String name;
    int num;

}

public class array_objects {

    public static void main(String[] args) {
        
        login log1 = new login(); // Object of reference variable log1
        log1.name = "Swarup";
        log1.num = 12;

        login log2 = new login(); // Object of reference variable log2
        log2.name = "Subham";
        log2.num = 19;

        login log[] = new login[2];
        log[0] = log1;
        log[1] = log2;

        // Getting all array
        for (login log_store : log) {
            System.err.println(log_store.name + " : " + log_store.num);
        }


    }
    
}
