import java.util.Scanner;

public class Primenumber {

	public static void main(String arg[])
	{
		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);
		Long num = sc.nextLong();
		int nCount = 0;
		for( int i = 1 ; i <= num ; i++ )
		{
			if( num % i == 0 )
				nCount++;
		}
		
		if(nCount == 2 )
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}
	}
	
}
