package interfaces;

interface Printable{
	 void print();
}

class Article implements Printable{
  @Override
	public void print() {
	  System.err.println("printing");
	}
}
public class InterfaceDemo1 {
	public static void main(String args[]) {
		Printable p = new Article();
		p.print();
	}
}
