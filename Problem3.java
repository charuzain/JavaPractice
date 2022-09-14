// create a class cylinder and use getter and setters to set its radius and height 
// use ➊ to calculate surface and volume of the cylinder 
// Use a constructor and repeat ➊
// Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters 
// Repeat ➊ for a sphere


class Cylinder {
  double radius;
  double height;

  // using constructor

  public Cylinder(double r, double h) {
    radius = r;
    height = h;
   }

  // void setRadius(double r) {
  //   radius = r;
  // }

  double getRadius() {
    return radius;
  }

  // void setHeight(double h) {
  //   height = h;
  // }

  double getHeight() {
    return height;
  }

  double surfaceArea() {
    return 2 * 3.14 * radius * height + 2 * 3.14 * radius * radius;
  }
 
  double volume() {
    return 3.14 * radius * radius * height;
  }

}

public class Problem3 {
  public static void main(String[] args) {

    Cylinder cyl = new Cylinder(1.0 , 1.0);
    // cyl.setHeight(1.0);
    // cyl.setRadius(1);
    System.out.println(cyl.getHeight());
    System.out.println(cyl.getRadius());
    System.out.println(cyl.surfaceArea());
    System.out.println(cyl.volume());


  }
}