final class A{ // We can't extend or inherit the class A
    public final void show(){
        // We can't override this method
        System.out.println("Swarup");
    }
}

public class FinalKeyword {
    public static void main(String args[]){

        final int x = 25; // Constant value
        System.out.println("Value: " + x);

        A a = new A();
        a.show();

    }
    
}
