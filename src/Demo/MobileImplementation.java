package Demo;

public class MobileImplementation {

	 public static void main(String[] args) {

         System.out.println( "hi");


         // create object of another class
   
         // classname referancename = new classname();
         Mobile samsung = new Mobile(4, 6, 256, "vivo", "android", "null" );   // object creation of a class
         samsung.getMobileDetails();
     }
	

}

