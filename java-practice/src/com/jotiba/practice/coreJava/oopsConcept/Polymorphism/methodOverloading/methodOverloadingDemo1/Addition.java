package overloading;

public class Addition {
	int n1;
	int n2;
	
	public int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	public int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	
	public double sum(int n1, int n2, double n3) {
		return n1 + n2 + n3;
	}
	
	public double sum(double n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
}
