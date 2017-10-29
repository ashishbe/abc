
public class Stringreverse1 {

	public static void main(String arg[])
	{
		
		String str = "ashish is good boy";
		
		for( int i = str.length()-1 ; i >= 0 ; i-- )
		{
			if( (str.charAt(i) == ' ') || (i == str.length()-1) )
			{
				int p = i-1;
				
				if(i == str.length()-1 )
				{
					p = i;
				}
				
				for( int j = p ; j >=0 ; j-- )
				{
					System.out.print(str.charAt(j));
					if( str.charAt(j) == ' ' || j == 0 )
					{
						System.out.print(" ");
						break;
					}
					
				}
			}
		}
	}
	
}
