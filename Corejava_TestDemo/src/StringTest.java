import java.lang.reflect.Method;

public class StringTest {
	
	public static void main(String arg[])
	{
		String str = new String("ashish");
		String str1 = new String("ashish");
		
		StringBuffer str2 = new StringBuffer("ashish");
		StringBuffer str3 = new StringBuffer("ashish");
		
		StringBuilder str4 = new StringBuilder("ashish");
		StringBuilder str5 = new StringBuilder("ashish");
		
		if(str.equals(str1))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("diffrent");
		}
		
		
		if(str2.equals(str3))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("diffrent");
		}
		
		if(str4.equals(str5))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("diffrent");
		}
		
		
		System.out.println(str.getClass().getName());

		
		
		Class c = str.getClass();

		Method [] m = c.getDeclaredMethods();
		
//		for(Method m1 : m)
//		{
//			System.out.println(m1.getName());
//		}
	}

}
