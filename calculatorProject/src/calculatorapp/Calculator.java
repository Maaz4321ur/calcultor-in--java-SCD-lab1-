package calculatorapp;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        char operator;

        System.out.println("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.println("Enter second number: ");
        num2 = sc.nextDouble();

        System.out.println("Choose an operator: +, -, *, /");
        operator = sc.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num2 != 0 ? num1 / num2 : Double.NaN;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
