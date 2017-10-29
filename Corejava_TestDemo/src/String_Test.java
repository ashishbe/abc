
public class String_Test {

	public static void main(String arg[])
	{
		String str = "aabcddf";
		StringBuffer str1 = new StringBuffer(str);
		
		for( int i = 0 ; i < str1.length() - 1; i++ )
		{
			for( int j = i+1 ; j < str1.length() ; j++ )
			{
				if( str1.charAt(i) == str1.charAt(j) )
				{
					int num = str1.charAt(j);
					char ch = (char) ++num;
				    str1.setCharAt(j, ch);
				    i++;
				    break;
				}
			}
		}
		
		System.out.println(str1);
	}
	
}
