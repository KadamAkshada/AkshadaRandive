package Demo;

public class primenumber 
{
         static int n = 100;
	public static void main(String[] args) 
	{
		
		 int i, j;
		 boolean flag = true;
		 
		 for (i=2; i<n; i++)          
		 {
			  for (j=2; j<i; j++)
			  {
				   if (i%j==0) 
				   {
					  flag = false;
					  break;
				    }
				    else 
				    {
					     continue;
				    } 
			    }
			  
			      if (flag) 
			      {
				   System.out.println(i);
			       }
			    
			  flag= true;  		 
        }
	 
	}
	
}
	