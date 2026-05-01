import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");

        System.out.println("Enter first number:");
        double a = input.nextDouble();

        System.out.println("Enter second number:");
        double b = input.nextDouble();

        System.out.println("Choose operation (+ - * /):");
        char op = input.next().charAt(0);

        double result;

        switch(op) {
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
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