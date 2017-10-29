
class Test_ex extends Exception
{
	
}

class bcddc
{
	public void ashish() throws Test_ex
	{
		throw new Test_ex();
	}
}

public class Test_Exception {
	
	
	public static void main(String arg[]) 
	{
		try
		{
		new bcddc().ashish();
		}
		catch (Test_ex e) {
			// TODO: handle exception
		}
	}
}
