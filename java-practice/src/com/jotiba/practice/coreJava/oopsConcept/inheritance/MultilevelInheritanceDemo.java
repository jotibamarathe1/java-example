package inheritance;

class Car{
	  public void vehicleType(){
      System.out.println("Vehicle Type is Car");
  }
}

class Maruti extends Car{
  public void speed(){
      System.out.println("Top speed is 90Kmph");
  }
}

class Maruti800 extends Maruti{
  public void model(){
      System.out.println("Model name is Maruti 800");
  }
}
public class MultilevelInheritanceDemo {
	 public static void main(String args[]){
	        Maruti800 obj=new Maruti800();
	        obj.vehicleType();
	        obj.speed();
	        obj.model();

	    }

}
