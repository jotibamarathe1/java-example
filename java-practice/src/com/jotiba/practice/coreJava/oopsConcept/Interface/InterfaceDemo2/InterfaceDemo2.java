package interfaces;

interface Vehicle{
	public void getColor();
	public void totalWheels();
}

class Car implements Vehicle{

	@Override
	public void getColor() {
		System.out.println("Red");
		
	}

	@Override
	public void totalWheels() {
		System.out.println("Four");
		
	}
	
}

class Bus implements Vehicle{

	@Override
	public void getColor() {
		System.out.println("Blue");
		
	}

	@Override
	public void totalWheels() {
		System.out.println("Eight");
		
	}
	
}
public class InterfaceDemo2{
	public static void main(String args[]) {
		Vehicle v1 = new Car();
		v1.getColor();
	    v1.totalWheels();
	    
	    Bus b1 = new Bus();
		b1.getColor();
	    b1.totalWheels();
	}
}

