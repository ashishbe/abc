import java.util.Scanner;

public class FabinoSeries {

	public FabinoSeries() throws Exception 
	{
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String arg[])
	{
		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int a = 0 , b = 1 , c;
		
		System.out.println(a);
		System.out.println(b);
		for( int  i = 0 ; i < num-2 ; i++ )
		{
			c = a + b ;
			a = b ; 
			b = c;
			
			System.out.println(c);
		}
		
	}
}
