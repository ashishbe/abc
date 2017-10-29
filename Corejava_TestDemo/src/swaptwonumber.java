
public class swaptwonumber {

	public static void main(String arg[])
	{
		
		int i = 10;
		String str1 = String.valueOf(i);
		System.out.println(str1);
		int m = Integer.valueOf(str1);
		System.out.println(m);
		
        // Declare two strings
		
		char  ch = 'a';
		char ch1 = 'b';
		
		ch = (char) (ch^ch1);
		ch1 = (char) (ch^ch1);
		ch = (char) (ch^ch1);
		
		System.out.println(ch+"  "+ch1);
		
        String a = "Hello";
        String b = "World";
         
        // Print String before swapping
        System.out.println("Strings before swap: a = " + 
                                       a + " and b = "+b);
         
        // append 2nd string to 1st
        a = a + b;
         
        // store intial string a in string b
        b = a.substring(0,a.length()-b.length());
         
        // store initial string b in string a
        a = a.substring(b.length());
         
        // print String after swapping
        System.out.println("Strings after swap: a = " + 
                                     a + " and b = " + b);
	}
	
}
