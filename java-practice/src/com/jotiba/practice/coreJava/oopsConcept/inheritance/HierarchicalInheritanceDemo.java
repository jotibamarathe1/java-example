package inheritance;

//3. Hierarchical inheritance

class Employee{
    float salary = 40000;
    
    public void displaySalary(){
       System.out.println("Employee salary is : " + salary);
    }
}

class PermanentEmployee extends Employee{
    double hike = 0.5;
      
    public void incrementSalary(){
        System.out.println("Permanent Employee incremented salary is : " + (salary + (salary * hike)));
    }
}

class TemporaryEmployee extends Employee{
     double hike = 0.35;
     
     public void incrementSalary(){
         System.out.println("Temporary Employee incremented salary is : " + (salary + (salary * hike)));
    }
}

     public class HierarchicalInheritanceDemo{
     public static void main(String args[]){
    		PermanentEmployee p = new PermanentEmployee();
    		TemporaryEmployee t = new TemporaryEmployee();
    		
    		p.displaySalary();
    		p.incrementSalary();
    		t.displaySalary();
    		t.incrementSalary();
     }
 }

