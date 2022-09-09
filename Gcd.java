

import java.util.Scanner;
public class Gcd {
  public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number");
            int num1 = sc.nextInt();
            System.out.println(num1);
            System.out.println("Enter Second number");
            int num2 = sc.nextInt();
            System.out.println(num2);

            int divisor = 1;
            if (num1 <= 0) {
              System.out.println("First no is less than or equal to zero , please enter number greater than zero");
            System.out.println("Please Enter Num1 again");
              num1 = sc.nextInt();
            }

            if (num2 <= 0) {
           System.out.println("Second no is less than or equal to zero , please enter number greater than zero");
              System.out.println("Please Enter Num2 again");
            num2 = sc.nextInt();
          }
            for(int i = 2 ; i <= num1 && i <= num2 ;i++){
              if (num1 % i == 0 && num2 % i == 0) {
                divisor = i;
              }
            }
            System.out.println("The GCD of " + num1 + " and " + num2 + " is " + divisor);
          
        }
    }


