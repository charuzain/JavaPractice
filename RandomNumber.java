import java.util.Random;
import java.util.Scanner;
public class RandomNumber {
  public static void main(String[] args) {
    
    Random random = new Random();
      int number = random.nextInt(100);
      System.out.println("The randomly generated number is " + number);

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number between 0 and 100");
      int num1 = sc.nextInt();
      System.out.println(num1);

      
      while (number != num1) {
        // check if user entered a number between 0 and 100
        if (num1 > 100 || num1 < 0) {
          System.out.println("Please enter number between 0 and 100");
          num1 = sc.nextInt();
        }

        if (num1 > number) {
          System.out.println("Number is too high , please enter a lower number");
          num1 = sc.nextInt();
        }

        if (num1 < number) {
          System.out.println("Number is too low , please enter a higher number");
          num1 = sc.nextInt();
        }
      }
        
       // if user entered a number which is equal to randomly generated number
  
      if(number == num1){
      System.out.println("The randomly generated number is " + number);
      System.out.println("The number you entered is " + num1);
      System.out.println("The number you entered matches with randomly generated number ");
    }
  }
  
}
