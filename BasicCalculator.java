import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1, n2, result;
        char operation;

        System.out.print("Enter first number: ");
        n1 = scan.nextDouble();

        System.out.print("Enter second number: ");
        n2 = scan.nextDouble();

        System.out.print("Enter operation (+, -, *, /): ");
        operation = scan.next().charAt(0);

        switch (operation) {
            case '+':
                result = n1 + n2;
                System.out.println("Result = " + result);
                break;
            case '-':
                result = n1 - n2;
                System.out.println("Result = " + result);
                break;
            case '*':
                result = n1 * n2;
                System.out.println("Result = " + result);
                break;
            case '/':
                if (n2 != 0) {
                    result = n1 / n2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator! Please choose +, -, *, or /.");
        }

        scan.close();
    }
}
