public class WrapperClass {

    public static void main(String args[]){
        int num = 12;

        Integer num1 = num; // autoboxing - primitive to object

        int num2 = num1; // auto unboxing - object to primitive
        System.out.println(num2);


        // Taking value from string and storing it in Integer(Wrapper class)

        String str = "23";
        int x = Integer.parseInt(str);
        System.out.println(x);
    }
    
}
