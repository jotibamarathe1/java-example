package interfaces;
//interface don't have constructor

interface Printable{
	 void print();//its a by default public and abstract method
}

class Article implements Printable{

	@Override
	public void print() {//but we have to mention public here 
		System.err.println("printing");
		}
}
public class InterfaceDemo1 {
	public static void main(String args[]) {
	  //Article p = new Article();
		Printable p = new Article();
		p.print();
	}
}
