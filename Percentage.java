import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks out of 100 to calculate percentage");
        System.out.println("Enter number in first subject");
        float num1 = sc.nextFloat();
        System.out.println("enter number in second subject");
        float num2 = sc.nextFloat();
        System.out.println("enter number in third subject");
        float num3 = sc.nextFloat();
        System.out.println("enter number in fourth subject");
        float num4 = sc.nextFloat();
        System.out.println("enter number in fifth subject");
        float num5 = sc.nextFloat();
        float percentage =( (num1+num2+num3+num4+num5) * 100 )/500;
        System.out.println(percentage);

    }
}