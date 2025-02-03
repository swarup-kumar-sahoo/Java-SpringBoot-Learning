class A{
    public void show(){
        System.out.println("Hello A");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("Hello B");
    }
}
class C extends B{
    @Override
    public void show(){
        System.out.println("Hello C");
    }
}
public class DynamicMethodDispatch{
    public static void main(String[] args) {

        A obj = new B(); // We can specify only child class for parent variable
        obj.show();

        obj = new A();
        obj.show();
        
        obj = new C();
        obj.show();
    }
}