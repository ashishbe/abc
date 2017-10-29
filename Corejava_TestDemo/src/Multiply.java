import java.util.Scanner;

public class Multiply {

	public static void main(String arg[])
	{
		System.out.println("enter any two values");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = a;
		for( int i = 1 ; i < b ; i++ )
		{
			a = a + temp;
		}
		
		System.out.println(a);
	}
}
