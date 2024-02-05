package overloading;


public class MethodOverloadingDemo {
public static void main(String args[]) {
	Addition a = new Addition();
	int result1 = a.sum(4, 8);
	System.out.println(result1);
	
	int result2 = a.sum(4, 8, 7);
	System.out.println(result2);
	
	double result3 = a.sum(4, 8, 7.2);
	System.out.println(result3);
	
	double result4 = a.sum(4.8, 8, 7);
	System.out.println(result4);
}
}
