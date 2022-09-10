import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String message;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter First number ");
            double num1 = sc.nextDouble();

            System.out.println("Enter an operator ");
            char operator = sc.next().charAt(0);

            System.out.println("Enter Second number ");
            double num2 = sc.nextDouble();

            double output;

            switch (operator) {
                case '+':
                    output = num1 + num2;
                    System.out.println("Sum of " + num1 + " and " + num2 + " is " + output);
                    break;
                case '-':
                    output = num1 - num2;
                    System.out.println("Difference of " + num1 + " and " + num2 + " is " + output);
                    break;
                case '*':
                    output = num1 * num2;
                    System.out.println("Product of " + num1 + " and " + num2 + " is " + output);
                    break;
                case '/':
                    output = num1 / num2;
                    System.out.println("Division of " + num1 + " and " + num2 + " is " + output);
                    break;
                default:
                    System.out.println("Please enter a valid operator + , - , * or / ");
                    break;
            }
            System.out.println("Do you want to continue press Y for Yes or N for No");
            message = sc.next();
        }
        while(message.equals("y")||message.equals("Y"));
    }
}
