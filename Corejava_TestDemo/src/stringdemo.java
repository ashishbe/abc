

interface abcccccc
{
	default void bcd()
	{
		System.out.println("ashish111");
	}
}

public class stringdemo implements abcccccc{

	public static void main(String arg[]) {
		
		String str1 = "ashish";
		String str2 = "jain";
	//	str1 = str1+str2;
	//	System.out.println(str1);
		String str3 = str1.concat(str2);
		System.out.println(str3);
		abcccccc ab = new stringdemo();
		ab.bcd();
		try
		{
			
		}
		catch (NullPointerException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
