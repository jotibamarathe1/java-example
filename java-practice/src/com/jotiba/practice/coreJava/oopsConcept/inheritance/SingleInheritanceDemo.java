package inheritance;

//1. Single inheritance 
class Shape{
    public void display(){
        System.out.println("Area of a Shape is:");
    }
 }
class Triangle extends Shape{
    public void areaOfTriangle(int b, int h){
    	double Area = (0.5)*b*h;
        System.out.println(Area);
    }
   }
 
public class SingleInheritanceDemo{
    public static void main(String args[]){
      Triangle t1 = new Triangle();
       
       t1.display();
       t1.areaOfTriangle(2,2);
  }
}

