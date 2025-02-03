class Apple{
    public void f1(){
        System.out.println("in A");
    }
}
class Fruit extends Apple{
    public void f2(){
        System.out.println("in B");
    }
}
public class Down_UpCasting{
    public static void main(String args[]){

        Apple obj = new Fruit(); // Up Casting
        obj.f1();

        Fruit obj1 = (Fruit) obj; // Down Casting
        obj1.f2();

    }
}