public class CalculationApp {
    public static int calculateProduct(int num1 , int num2){
        return num1*num2;
     
    }
    public static double calculateQuotient(double num1 , double num2){
        return num1 / num2;

    }
    public static void main(String[]args){
        int product = calculateProduct(8,9);
        double Quotient = calculateQuotient(45.3,6.78);
        System.out.println("product is:"+product);
        System.out.println("quotient is:"+Quotient);
    }
    
}
    