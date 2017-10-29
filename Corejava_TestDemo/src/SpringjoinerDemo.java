import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class SpringjoinerDemo {
	
	public static void main(String arg[])
	{
		StringJoiner sjoin = new StringJoiner(",");
		sjoin.add("ashish");
		sjoin.add("manoj");
		sjoin.add("niraj");
		
		System.out.println(sjoin.toString());
		
		System.out.println("enter any number");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		for( int i = 0 ; i < num ; i++ )
		{
			for(int j = num ; j > 0 ; j-- )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
