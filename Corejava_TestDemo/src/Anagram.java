import java.util.Arrays;

public class Anagram {

	public static void main(String arg[])
	{
		String str1 = "ashish";
		String str2 = "ishash";
		
		char[] copychar1 = str1.toLowerCase().toCharArray();
		char[] copychar2 = str2.toLowerCase().toCharArray();
		
		boolean status = getaramstrong(copychar1 , copychar2);
		
		if( status )
		{
			System.out.println(" string are aramstrong ");
		}
		else
		{
			System.out.println(" string are not aramstring ");
		}
	}
	
	private static boolean getaramstrong(char[] char1 , char[] char2)
	{
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		if( char1.length != char2.length )
		{
			return false;
		}
		
		boolean status = Arrays.equals(char1, char2);
		
		return status;
	}
	
}
