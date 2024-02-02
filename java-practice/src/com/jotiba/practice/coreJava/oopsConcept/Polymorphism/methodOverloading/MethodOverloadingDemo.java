package overloading;


public class MethodOverloadingDemo {
public static void main(String args[]) {
	ArithmeticOperators a = new ArithmeticOperators();
	int r1 = a.sum(4, 8);
	System.out.println(r1);
	
	int r2 = a.sum(4, 8, 7);
	System.out.println(r2);
	
	double r3 = a.sum(4, 8, 7.2);
	System.out.println(r3);
	
	double r4 = a.sum(4.8, 8, 7);
	System.out.println(r4);
}
}
