import java.util.Scanner;

public class StarProgram {

	public static void main(String ag[])
	{
		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for( int i = 0 ; i <= num ; i++ )
		{
			for( int j = 0 ; j <= i ; j++ )
			{
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("second");
		
		for( int i = num ; i >= 0 ; i-- )
		{
			for( int j = 0  ; j <= i ; j++  )
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	
		System.out.println("third");
		
		int nCount = num -1;
		for( int i = 1 ; i <= num ; i++ )
		{
			for( int j = nCount ; j >= 0 ; j-- )
			{
				System.out.print(" ");
			}
			
			nCount--;
			
			for( int k = 1 ; k <= 2*i - 1 ; k++ )
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		

	}
}
