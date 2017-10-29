class abccc 
{
	private abccc()
	{
		
	}
	
	// agrasiv loading
//	static abccc abc = new abccc();
	
	static abccc abc;
	
	public static abccc getinstance()
	{
		if( abc == null )
		{
			abc =  new abccc();
		}

		return abc;
	}
}
public class Singleton {

	public static void main(String arg[])
	{
		System.out.println(abccc.getinstance());
		System.out.println(abccc.getinstance());
		System.out.println(abccc.getinstance());
	}
}
