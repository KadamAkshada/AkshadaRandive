package Demo;

public class staticAndNonstatic {

	public static void main(String[] args) {
		System.out.println( "This is main class" );
		car();
		staticAndNonstatic o= new staticAndNonstatic();
		o.bike();
    }

	public static void car() {                         // static method
		 System.out.println("This is car class");
	}
	
	public void bike() {                               // non static method
		 System.out.println("This is bike class");
	}
	
}
