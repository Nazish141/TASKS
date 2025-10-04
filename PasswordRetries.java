import java.util.Scanner;
public class PasswordRetries {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String correctpassword="secret123!";
        int attempts=3;
        while(attempts>0){
            System.out.print("Enter your password:");
            String userinput = scanner.nextLine();
            if(userinput.equals(correctpassword)){
                System.out.println("Login successful.");
                break;
                
            }else{
                attempts--;
                if (attempts>0){
                    System.out.println("incorrect password. you have"+attempts+"attempts left.");
                }else{
                    System.out.println("account locked.please contact support.");
                }
            }
        }
        scanner.close();
    }
}