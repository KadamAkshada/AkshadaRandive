package Demo;

public class Add {
        int z;   // global variable
        
        
	 public static void main(String[] args) {
		Add m = new Add();
		int a = 10;
		int b = 30;
		int c = a+b;
		System.out.println("The addition of 10 and 30 is : " + c);
		div();
		m.multi();
	 }
	
     public static void div(){
    	 // we can call from static to static method directly
	    int x = 40;
	    int y = 80;
	    int z = y/x;
	    System.out.println(z);
	 }
	
	 public void multi() {
		 // we can call from static to non static method but will have to create the object first & vice not possible
	    int p = 7;
	    int q = 5;
	    int r = p*q;
	    System.out.println(r);
	    System.out.println(z);
	    //to access z it is not declared globally, so value of z will not get printed so make it global
	    
	 }
	
    
    
    
    
    
	
	
}
