import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");

        System.out.println("Enter first number:");
        double a = input.nextDouble();

        System.out.println("Enter second number:");
        double b = input.nextDouble();


        System.out.println("Choose operation:");
        System.out.println("1 - Addition (+)");
        System.out.println("2 - Subtraction (-)");
        System.out.println("3 - Multiplication (*)");
        System.out.println("4 - Division (/)");

        char op = input.next().charAt(0);

        double result;

        switch(op) {
            case '1':
                result = a + b;
                break;

            case '2':
                result = a - b;
                break;

            case '3':
                result = a * b;
                break;

            case '4':
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero");
                    return;
                }
                result = a / b;
                break;

            default:
                System.out.println("Invalid operation");
                return;
        }
        

        System.out.println("Result: " + result);

        input.close();
    }
}