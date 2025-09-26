import java.util.Scanner;
public class Tasks {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to our bank account!");
        System.out.println("1:view balance");
        System.out.println("2:deposit");
        System.out.println("3:withdraw");
        System.out.println("4:exit");
        System.out.println("enter your choice:");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
            System.out.print("viewing balance..");
            break;
            case 2:
            System.out.print("proceeding to deposit");
            break;
            case 3:
            System.out.print("initating withdraw");
            break;
            case 4:
            System.out.print("exiting thank you!");
            break;
            default:
            System.out.print("invalid choice. please try again.");
    
        }
        scanner.close();

    }
    
}
