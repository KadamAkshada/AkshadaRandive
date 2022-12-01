package Demo;

public class Employee {

		
			private String name;                         //property
			private String designation;
			private long mobilenumber;
			private String address;
			private int yearofexperience;
		
	public Employee() {
			
		}
		
		
	public Employee(String name, String designation) {
			this.name=name;
			this.designation=designation;
		}


	public Employee(String name, String designation, long mobilenumber,String address,int yearofexperience) {
		    this.name=name;
		    this.designation=designation;
		    this.mobilenumber=mobilenumber;
		    this.address=address;
		    this.yearofexperience=yearofexperience;
		}
		
	public void getdetail() {
			System.out.println("name :"  + name );
			System.out.println("designation : " + designation );
			System.out.println("mobilenumber : " + mobilenumber );
			System.out.println("address : " + address );
			System.out.println("yearofexperience : " + yearofexperience );
			System.out.println("");
		}
	
	public void getrecord() {
		System.out.println("name :"  + name );
		System.out.println("designation : " + designation );
		
    	}
		
	public static void main(String[] args) {
			Employee x = new Employee("Riya","Manager", 610087900, "Pune",4);
			Employee y = new Employee("Mrunal","Chairman");
			x.getdetail();
			y.getrecord();
		}
		
		
		
}


