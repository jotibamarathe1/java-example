package overloading;

public class Students {
	String name;
    int rNo;
    
    public void printInfo(){
        System.out.println("No information");
    }

    public   void printInfo(String name){
        System.out.println(name);
    }

    public  void printInfo(int rNo){
        System.out.println(rNo);
    }

    public  void printInfo(String name, int rNo){
        System.out.println(name + " " + rNo);
    }

    public  void printInfo(int rNo ,String name){
        System.out.println(rNo + " " + name);
    }
}
