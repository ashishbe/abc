import java.io.IOException;

public enum Abc {

	apple , mango;
	public static void main(String str[]) throws Exception
	{
		System.out.println("ashish");
		Abc a = Abc.apple;
		
		
		try
		{
			System.out.println("hello");
			throw new Error();
		}
		catch (Error e) {
			System.out.println("catch");
		}
		
	}
}
