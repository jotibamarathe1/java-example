package inheritance;

class Electronics {
    public void deviceType() {
       System.out.println("Device Type is Electronics");
    }
 }

class Television extends Electronics {
    public void category() {
       System.out.println("Device category is Television");
   }
}

class LED extends Television {
   public void displayTech() {
      System.out.println("Display Technology is LED");
   }
}

public class MultilevelInheritanceDemo {
	public static void main(String[] args) {
		LED led = new LED();
		led.deviceType();
		led.category();
		led.displayTech();
		}
}
