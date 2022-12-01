package Demo;

public class car extends bike {
	  

	public static void main(String[] args) {
		car  c  = new car (10, 30);
		bike z = new bike ();
	}
	
	
	public car(int a, int b) {	
		
		System.out.println(a +"  " + b );
		audi();
		swift();
	   
	}

	
	
	public static void audi() {
		System.out.println("audi car");	
	}
	
	public void swift() {
		System.out.println("swift car");
	}
	
		
}
