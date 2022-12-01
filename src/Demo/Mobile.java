package Demo;

public class Mobile {
      private int camera;
      private int RAM;
      private int ROM ;
      private String brandname;
      private String processor;
      private String modelno;
      
  
      public Mobile() {                                // default constructor
    	System.out.println("default constructor");  
      }
      
      
	 public Mobile(int camera)	{                      // parameterized constructor with 1 parameter
		 System.out.println("int camera");
	 }
      
	 
     public Mobile ( int camera, int RAM, int ROM, String brandname, String processor, String modelno) {               //  parameterized constructor with 2 parameter
          this.camera= camera;
    	  this.RAM= RAM;
    	  this.ROM= ROM;
    	  this.brandname=brandname;
    	  this.processor=processor;
    	  this.modelno=modelno;
     }
     
     
    	  public void getMobileDetails() {
    		  System.out.println(camera);
    		  System.out.println(RAM);
    		  System.out.println(ROM);
    		  System.out.println(brandname);
    		  System.out.println(processor);
    		  System.out.println(modelno);
    	  }
    	  
    	  
}
      
    	
		



