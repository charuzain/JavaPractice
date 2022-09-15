import java.io.*;
import java.util.*;

class Car {
    int noOfGear;
    String color;
    // Write your constructor and printCarInfo method here.
    
    public Car(int num ,String str){
        this.noOfGear = num;
        this.color = str;       
    }
    
    public void printCarInfo(){
        System.out.println(this.noOfGear);
        System.out.println(this.color);        
    }
}

class RaceCar extends Car {
    int maxSpeed;
    // Write your constructor and printRaceCarInfo method here.  
    public RaceCar(int x , String str , int s){
        super(x, str);
        this.maxSpeed = s;
         }
    public void printRaceCarInfo(){
         System.out.println("noOfGear: " + this.noOfGear);
         System.out.println("color: " + this.color);
        System.out.println("maxSpeed: " + this.maxSpeed);
    }
    
}

class Solution {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int noOfGear = sc.nextInt();

        // [IGNORE]: Extra "end line" in previous line.
        sc.nextLine();

        String color = sc.nextLine();
        int maxSpeed = sc.nextInt();
        RaceCar raceCar = new RaceCar(noOfGear, color, maxSpeed);
        raceCar.printRaceCarInfo();
    }
}