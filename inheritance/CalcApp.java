
public class CalcApp{
    public static void main(String args[]){

        AdvCalc a = new AdvCalc(); //AdvClac have inherit Calc class so we dont need to declare a Calc class.
        //Benifits of inheritance is it reduces Redudancy.
        int resultAdd = a.add(12,13);
        int resultSub = a.sub(40, 20);
        int resultMul = a.mul(10,10);
        int resultDiv = a.div(20,2);

        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSub);
        System.out.println("Multiplication: " + resultMul);
        System.out.println("Division: " + resultDiv);


    }
}