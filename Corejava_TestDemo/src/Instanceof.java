
class abbc
{
	
}

public class Instanceof {

	public static void main(String arg[]) throws ClassNotFoundException
	{
		abbc abc = new abbc();
		
		System.out.println(abc instanceof abbc);
		
		Thread t = new Thread();
		System.out.println(Class.forName(arg[0]).isInstance(t));
	}
}
