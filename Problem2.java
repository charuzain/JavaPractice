// Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.


class Cellphone {
  int price;
  String color;
  String brand;
  String model;

  public void ring() {
    System.out.println("ringing....");
  }

  public void vibrate() {
    System.out.println("vibrating...");
  }
}

//Create a class Square with a method to initialize its side, calculating area, perimeter etc

class Square {
  int side;

  int area() {
    return side * side;
  }
 
  int perimeter() {
    return 4 * side;
  }

}


public class Problem2 {
  public static void main(String[] args) {
    
    Cellphone s9 = new Cellphone();
    s9.brand = "Samsung";
    s9.color = "black";
    s9.price = 1200;
    s9.ring();


    // calcuate area and perimeter of square
    Square sq = new Square();
    sq.side = 3;
    int area = sq.area();
    int perimeter = sq.perimeter();
    System.out.println(area);
    System.out.println(perimeter);
  }
}




