class Suv{
    public void varity(){
        System.out.println("Mahendra Thar");
    }
}
class Car extends Suv{
    public void varity(){ // Overriding
        System.out.println("Mahendra Thar");
    }
}

public class JavaOverriding {

    public static void main(String[] args) {
        Car c = new Car();
        c.varity();
        
    }
    
}
