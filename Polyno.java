// Create the classes here
class Shape{
    String shapeType;
    void printMyType(){
        System.out.println(shapeType);
        }
}
    
class Square extends Shape{
    String shapeType = "square";
    int length;
        
     Square(int length){
        this.length = length;
     }
        
    int calculateArea(){
         return length * length;
        }
        
      void printMyType(){
            System.out.println(shapeType);
        }
        
    }
 class Rectangle extends Shape{
      String shapeType = "rectangle";
        int length;
        int breadth;
         
        Rectangle(int length , int breadth){
         this.length = length;
         this.breadth = breadth;
     }
         int calculateArea(){
            return length * breadth;
        }
        
        void printMyType(){
            System.out.println(shapeType);
        }
        
    }

class Polyno {
	
	public static void main(String args[]) {

    Square sq = new Square(5);
        sq.printMyType();
        System.out.println(sq.calculateArea());
        
    Rectangle rec = new Rectangle(5 , 4);
        rec.printMyType();
        System.out.println(rec.calculateArea());
	}
}