package classes;

public class Example1 {
     String name;
     int rollNumber;
     
     public static void main(String args[]) {
		Example1 o1 = new Example1();
		o1.name="s1";
		o1.rollNumber=1;
		
		Example1 o2 = new Example1();
		o2.name="s1";
		o2.rollNumber=1;
		
		System.out.println("Name is: " + o1.name + " and Roll Number is: " + o1.rollNumber);
	}
}
