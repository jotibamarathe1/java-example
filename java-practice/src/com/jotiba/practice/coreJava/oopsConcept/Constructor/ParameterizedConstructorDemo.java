package constructor;

//2) Parameterized or Argument constructor

class Student3{
String name;
int rNo;
static String schoolName="VTS";

public Student3(String name, int rNo){
   this.name = name;
   this.rNo = rNo;
}

public void getStudentsDetails(){
       System.out.println(name+" " +rNo+" "+schoolName);
   }
}

public class ParameterizedConstructorDemo{
public static void main(String args[]){
 Student3 s1 = new Student3("Aman", 1);
 s1.getStudentsDetails();
 
 Student3 s2 = new Student3("Sachin", 2);
 s2.getStudentsDetails();
 
}
}




