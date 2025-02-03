package tools;
// Calc is Super Class 
// AdvCalc is Sub class
// To inherit we use a keyword called extends



public class AdvCalc extends Calc {

    public int mul(int n1, int n2){
        return n1*n2;
    }

    public int div(int n1,int n2){
        return n1/n2;
    }
    
}
