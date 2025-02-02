class B{
    public B(){
        System.out.println("Default Constructor of B");
    }
    public B(int m){
        //this(); // It will call Default Constructor of B
        System.out.println("Parametrized Constructor of B");
    }
}
class A extends B{
   public A(){
        System.out.println("Default Constructor of A");
   }
   public A(int n){
        super(12); // Basically it will call Parametrized Constructor of B
                     // If i dont mention value inside super it will call Default Constructor of B
        System.out.println("Parametrized Constructor of A");
   }
}
public class SuperMethod {
    public static void main(String[] args) {
        A a = new A(6);
        a.getClass();
    }
}
