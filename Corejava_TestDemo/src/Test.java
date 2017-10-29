import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

class abcc extends Test
{
	abcc() throws IOException
	{
		
	}
}

 class Test {
	 
	 
	 protected Test() throws IOException
	 {
		
	 }
	 
	 
	 public void add(float f)
	 {
		 System.out.println("ashish");
	 }
	 
	    public boolean isPerfectNumber(int number){
	         
	        int temp = 0;
	        for(int i=1;i<=number/2;i++){
	            if(number%i == 0){
	                temp += i;
	            }
	        }
	        if(temp == number){
	            System.out.println("It is a perfect number");
	            return true;
	        } else {
	            System.out.println("It is not a perfect number");
	            return false;
	        }
	    }

	 public boolean isaramstrong(int number)
	 {
		 int temp = 0;
		 int no1 = number;
		 while ( number != 0 ) {
			int no = number % 10;
			temp = temp + no * no * no;
			number = number / 10 ;
		}
		 
		 if( no1 == temp )
		 {
			 return true;
		 }

		 return false; 


	 }
	 
	 public int factorial(int number)
	 {
		 int temp = 1;
		 
		 for( int i = number ; i > 0 ; i-- )
		 {
			 temp = temp * i;
		 }
		 
		 return temp;
	 }
	 
	 public int reversenumber(int number)
	 {
		 int temp = 0;
		 while ( number != 0 ) {
			int no = number % 10;
			temp = temp * 10 + no;
			number = number / 10;
		}
		 
		 return temp;
	 }
	 
	public static void main(String arg[]) throws IOException
	{

		
		Test ipn = new Test();
		System.out.println("Is reverse number: "+ipn.reversenumber(24444265));
//		System.out.println("Is factorial number: "+ipn.factorial(4));
//		System.out.println("Is armstrong number: "+ipn.isaramstrong(153));
 //       System.out.println("Is perfect number: "+ipn.isPerfectNumber(29));
		
//		final ArrayList al2 = new ArrayList();
//		ArrayList al = new ArrayList();
//		al = al2;
//		al2.add(10);
//		al2.add(20);
//		
//		for( int i = 0 ; i< al.size() ; i++ )
//		{
//			System.out.println(al.get(i));
//		}
		
	/*	
		Hashtable<String, Integer> hm = new Hashtable<>();
		hm.put("Ashish", 1);
		hm.put("manish", 2);
		hm.put("pawan", 1);
		hm.put("pawan", 2);
		
		Set<String> set = hm.keySet();
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			int value = hm.get(key);
			System.out.println(key+" with "+value);
		}
		
//		String str = null;
//		if(str.equals(null))
//		{
//			System.out.println("true");
//		}
//		else
//		{
//			System.out.println("false");
//		}
		
		Vector<Integer> vv = new Vector<Integer>();
		vv.add(5);
		vv.add(6);
		System.out.println(vv.get(1));
		*/
	}
}
