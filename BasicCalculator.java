import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter operation (+, -, *, /): ");
        String operation = scanner.next();

        double result = 0;

        switch (operation) {
            case "+":
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.print("Result: " + result);
                } else {
                    System.out.println("Error! Zero cannot be denominator.");
                }
                break;
                default:
                System.out.println("Invalid operation");
        }
            scanner.close();
    }
}
