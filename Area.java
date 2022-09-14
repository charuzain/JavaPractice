// Area of rectangle;
// Take the length and breadth as a input from user and calculate the area
// Length and breadth should be an integer

import java.util.Scanner;
class Solution {
	
	public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length");
        int length = sc.nextInt();

        System.out.println("Enter the breadth");
        int breadth = sc.nextInt();
         
        int area = length * breadth;
        System.out.println(area);
		
	}
}