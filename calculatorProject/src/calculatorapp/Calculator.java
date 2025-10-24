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
                if(num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                    sc.close();
                    return;  // Program yahan stop kar dega division by zero par
                }
                break;
            default:
                System.out.println("Invalid operator!");
                sc.close();
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
