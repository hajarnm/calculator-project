import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        double a = input.nextDouble();

        System.out.println("Enter second number:");
        double b = input.nextDouble();

        double result = a + b;

        System.out.println("Result: " + result);
    }
}