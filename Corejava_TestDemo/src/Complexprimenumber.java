import java.util.Scanner;

public class Complexprimenumber {

	
	public static void main(String arg[])
	{
		System.out.println("start");
		Complexprimenumber test = new Complexprimenumber();
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		
		boolean bb = test.isprime(num);
		if( bb == true )
		{
			System.out.println(num+" prime");
		}
		else
		{
			System.out.println(num+" not prime");
		}
		
	}
	
	boolean isprime(long n)
	{

	    if (n == 2)
	        return true;
	    if( n == 3)
	        return true;
	    if (n % 2 == 0)
	        return false;
	    if (n % 3 == 0)
	        return false;

	    int i = 5;
	    int w = 2;

	    while (i * i <= n)
	    {
	        if (n % i == 0)
	            return false;

	        i += w;
	        w = 6 - w;
	    }
		return true;
	}
}
