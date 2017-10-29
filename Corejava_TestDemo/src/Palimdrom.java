import java.io.IOException;
import java.util.Scanner;

public class Palimdrom {

	public static void main(String arg[])
	{
//		int i = 2;
//		String str1 = String.valueOf(i);
//		System.out.println(str1);
		
		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int num1 = num;
		int num2 = 0;
		
		while (num1 != 0 ) {
			int r = num1%10;
			num2 = num2*10 + r;
			num1 = num1/10;
		}
		
		if( num2 == num )
		{
			System.out.println("number is palimdrom");
		}
		else
		{
			System.out.println("number is not palimdrom");
		}
		
	}
	
}
