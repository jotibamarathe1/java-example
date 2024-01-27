package classes;

class Student1{
	String name;
	int rollNumber;
}

public class ClassesAndObjects2 {
    public static void main(String args[]) {
	Student1 s1 = new Student1();
	s1.name="s1";
	s1.rollNumber=1;
	
	System.out.println(s1.name);
	System.out.println(s1.rollNumber);
}
}
