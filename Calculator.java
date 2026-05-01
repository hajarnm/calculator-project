import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");

        // 🔹 Validation for first number
        System.out.println("Enter first number:");
        if (!input.hasNextDouble()) {
            System.out.println("Error: Invalid first number");
            return;
        }
        double a = input.nextDouble();

        // 🔹 Validation for second number
        System.out.println("Enter second number:");
        if (!input.hasNextDouble()) {
            System.out.println("Error: Invalid second number");
            return;
        }
        double b = input.nextDouble();

        System.out.println("Choose operation:");
        System.out.println("1 - Addition (+)");
        System.out.println("2 - Subtraction (-)");
        System.out.println("3 - Multiplication (*)");
        System.out.println("4 - Division (/)");
        System.out.println("5 - Power (a^b)");
        System.out.println("6 - Square (a²)");
        System.out.println("7 - Square Root (√a)");

        // 🔹 Validate operation input
        if (!input.hasNext()) {
            System.out.println("Error: No operation selected");
            return;
        }

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

            case '5':
                result = Math.pow(a, b);
                break;

            case '6':
                result = a * a;
                break;

            case '7':
                if (a < 0) {
                    System.out.println("Error: Cannot calculate square root of negative number");
                    return;
                }
                result = Math.sqrt(a);
                break;

            default:
                System.out.println("Invalid operation selected");
                return;
        }

        System.out.println("Result: " + result);

        input.close();
    }
}