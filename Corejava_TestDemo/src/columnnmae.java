import java.util.Scanner;

public class columnnmae {

	public static void main(String arg[])
	{
		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		StringBuffer sb = new StringBuffer();
		
		while (num != 0 ) {
			
			if( num < 26 )
			{
				char ch = (char) (64 + num);
				sb.append(ch);
				break;
			}
			
			num = num - 26;
			sb.append("A");
		}
		
		System.out.println(sb);
	}
	
}
