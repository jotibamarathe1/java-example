package classes;
class Student{
	   String name;
	   int rollNumber;

	   public void getStudentDetails(){
	      System.out.println("Name of the student is " + this.name);
	      System.out.println("Roll Number of the student is "  + this.rollNumber);

	   }
	}

	public class Oopsexample4{
	   public static void main(String args[]){
	      Student s1 = new Student();
	      s1.name = "Rohit";
	      s1.rollNumber = 1;

	      Student s2 = new Student();
	      s2.name  = "Nitin";
	      s2.rollNumber = 2;

	      s1.getStudentDetails();
	      s2.getStudentDetails();
	   }
	}

