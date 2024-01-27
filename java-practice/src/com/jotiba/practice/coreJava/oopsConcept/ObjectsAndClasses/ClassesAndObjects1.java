package classes;

public class ClassesAndObjects1 {
     String name;
     int rollNumber;
     
     public static void main(String args[]) {
		ClassesAndObjects1 o1 = new ClassesAndObjects1();
		o1.name="Aman";
		o1.rollNumber=1;
		
		ClassesAndObjects1 o2 = new ClassesAndObjects1();
		o2.name="Rohit";
		o2.rollNumber=2;
		
		System.out.println("Name is: " + o1.name + " and Roll Number is: " + o1.rollNumber);
		System.out.println("Name is: " + o2.name + " and Roll Number is: " + o2.rollNumber);
	}
}
