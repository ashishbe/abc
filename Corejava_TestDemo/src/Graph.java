
public class Graph {

	public static void main(String arg[])
	{
		int num = 22;
		
		for( int i = num ; i > 1 ; i-- )
		{
			System.out.print("|");
			for( int j = 0 ; j < i ; j++ )
			{				
				System.out.print("*");
			}
			
			if( i % 2 != 0 )
			{
				System.out.print("#");
				System.out.println();
				System.out.print("|");
				for( int k = 0 ; k < i ; k++ )
					System.out.print("*");
			}
			
			System.out.print("#");
			System.out.println();
			
		}
	}
	
}
