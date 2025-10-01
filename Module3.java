import java.util.Scanner;
import java.util.Random;
public class Module3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numbertoguess= random.nextInt(100)+1;
        int userguess=0;
        int attempts =0;
        System.out.println("welcome to number guessing game!");
        System.out.println("enter the number between 1 and 100");
        while(true){
           System.out.println("numbertoguess="+numbertoguess);
            System.out.print("enter your guess:");
            userguess=scanner.nextInt();
            attempts++;
            if(userguess<numbertoguess){
                System.out.println("too low please try again!");
                

            }else if(userguess>numbertoguess){
                System.out.println("too high please try again!");
                

            }else{
                System.out.println("congratulations you guessed right number!"+numbertoguess+"in"+attempts+"attempts!");
                break;
            }
        }
        scanner.close();

    }
    
}
