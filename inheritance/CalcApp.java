
public class CalcApp{
    public static void main(String args[]){

        VeryAdvCalc a = new VeryAdvCalc(); //AdvClac have inherit Calc class so we dont need to declare a Calc class.
        //Benifits of inheritance is it reduces Redudancy.
        int resultAdd = a.add(4,6);
        int resultSub = a.sub(4, 6);
        int resultMul = a.mul(4,6);
        int resultDiv = a.div(4,6);
        int resultPow = (int)a.power(4,6);

        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSub);
        System.out.println("Multiplication: " + resultMul);
        System.out.println("Division: " + resultDiv);
        System.err.println("Power: " + resultPow);


    }
}