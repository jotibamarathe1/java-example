package constructor;

//1.By default or Non-Parameterized or Non-Argument constructor.


class Bike{

    public Bike(){
        System.out.println("Bike created");
    }
 }

public class DefaultConstructorDemo{
    public static void main(String args[]){
      Bike b1 = new Bike();
  }
}
