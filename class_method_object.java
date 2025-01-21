
class add{
    public int addition(int a, int b){
        return a + b;
    }

    public String random(String c){
        return c;
    }
}
public class class_method_object {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String c = "Hello";

        add Add = new add();
        int Results = Add.addition(a,b);
        System.err.println("Results are : " + Results);

        String okay = Add.random(c);
        System.out.println("This is a String " + okay);
    }
}
