package overloading;


public class MethodOverloadingDemo2{
    public static void main(String args[]){
      Students s1 = new Students();
      
      s1.printInfo();
      s1.printInfo("Rohit");
      s1.printInfo(1);
      s1.printInfo("Rohit", 1);
      s1.printInfo(1, "Rohit");
  }
}

