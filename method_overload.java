class addition{

    public int add(int a, int b){
        return a + b;
    }

    public double add(int a, int b, int c){
        return a + b + c;
    }

    public double add(int b){
        return b;
    }
}
public class method_overload{
    public static void main(String[] args) {
        
        int a = 20;
        int b = 40;
        int c = 50;
        addition Add = new addition();

        int result = (int) Add.add( a, b, c);
        System.out.println(result);


    }
}