import java.util.Scanner;
public class Average {
    public static void main(String []args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter numbers you want:");
        int num = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= num;i ++){
            System.out.print("Enter number"+i+":");
            int n= scanner.nextInt();
            sum = sum + n;
        }
        double average = (double)sum/num;
        System.out.println("sum "+sum);
        System.out.print("average"+average);
        scanner.close();



    }
    
}

