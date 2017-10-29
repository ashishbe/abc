
public class Removeduplicatechar {

	public static void main(String arg[])
	{
		String str = "ashishdsnbcijlsfkkjsdfhcjbvjhdfbvkj";
		char ch[] = str.toCharArray();
		
		for( int i = 0 ; i < ch.length ; i++ )
		{
			for( int j = i+1 ; j < ch.length ; j++ )
			{
				if( ch[i] == ch[j] )
				{
					ch[j] = ' ';
//					int m = j;
//					ch[j] = ch[j+1];
//					for( int k = j+1 ; k < ch.length ; k++ )
//					{
//						ch[m] = ' ';
//					}
				}
			}
		}
		
		System.out.println(ch);
	}
}
