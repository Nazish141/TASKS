import java.util.Scanner;
public class BasicCalculator{
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("enter frist number:");
        double num1 = scanner.nextDouble();
        System.out.print("enter second number");
        double num2= scanner.nextDouble();
        System.out.print("enter operation(+.-,*,/):");
        String operation = scanner.next();
        double result;
        switch(operation){
            case "+":
            result =  num1 + num2;
            System.out.print("Result is:"+result);
            break;
            case"-":
            result= num1 - num2 ;
            System.out.print("Result is:"+result);
            break;
            case"*":
            result = num1 * num2;
            System.out.print("Result is:"+result);
            break;
            case"/":
            if(num2 != 0){
                result = num1 / num2;
                System.out.print("Result is:"+ result);
            }else{
                System.out.print("cannot divisible by zero");

            }
            break;
            default:
            System.out.print("invalid operation,please enter only +,-,*,/");
        
         }
         scanner.close();
    }
 }

