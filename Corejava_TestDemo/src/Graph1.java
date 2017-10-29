
public class Graph1 {

	public static void main(String arg[])
	{                                            
                                             
	       for (int i=1; i<=27; ++i) 
	       {
			System.out.print("--");
	       }                                                       
	       System.out.println("");                                           
	       for (double t=0; t<=3000; t+=150)                              
	       { 
	    	   
	    	   float r = (float)Math.exp(-0.001*t); 
	           int  R = (int)(50*r+0.5);                                
	           System.out.print("|");                                       
	           for (int i=1; i<=R; ++i)
	           {
	        	   System.out.print("*");                                    
	           }     
	                                              
	           System.out.println("#");                                      
	       }  
	}
}
