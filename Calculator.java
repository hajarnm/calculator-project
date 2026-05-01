import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        double a = input.nextDouble();

        System.out.println("Enter second number:");
        double b = input.nextDouble();



        System.out.println("Choose operation (* /):");
        char op = input.next().charAt(0);

        double result = 0;

        switch(op) {
            case '*':
                result = a * b;
                break;

            case '/':
                if (b != 0)
                    result = a / b;
                else {
                    System.out.println("Error: Cannot divide by zero");
                    return;
                }
                break;

            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("Result: " + result);

       
    }
}