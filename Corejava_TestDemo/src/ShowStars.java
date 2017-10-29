import java.util.Scanner;

public class ShowStars {

	public static void main(String arg[])
	{
		System.out.println("enter any number");
//		Scanner sc = new Scanner(System.in);
		int num = 5/*sc.nextInt()*/;
		
		for( int i = num ; i > 0 ; i-- )
		{
			for( int j = num ; j > i ; j-- )
			{
				System.out.print(" ");
			}
			
			for( int k = 1 ; k < i*2 ; k++ )
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
