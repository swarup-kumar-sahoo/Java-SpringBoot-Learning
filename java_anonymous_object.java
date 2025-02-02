class Earth{
    public Earth(){ // Constructor
        System.out.println("Hello");
    }
    public void animals(){
        System.out.println("Tiger");
    }
}

public class java_anonymous_object{

    public static void main(String[] args) {

        //We specify object without Reference variable
        //The object is created on Heap but the memory doesn't have any connection to stack

        new Earth().animals(); // Anonymous Object
        
        new Earth().getClass(); // Calling Constructor only


    }

}