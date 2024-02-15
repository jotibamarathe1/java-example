package overriding;

class Java extends Language {
  @Override
	  public void displayInfo() {
	    System.out.println("Java Programming Language");
	  }
	}

public class MethodOverridingDemo1{
	public static void main(String args[]) {
	    Java j1 = new Java();
	    j1.displayInfo();
	}
}