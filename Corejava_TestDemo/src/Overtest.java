
class bbb
{
	public void add()
	{
		System.out.println("super");
	}
}

class ccc extends bbb
{
	public void add()
	{
		System.out.println("sub");
	}
}


public class Overtest {

	public void ajay(int ... i)
	{
		System.out.println("ashish");
	}
	
	public static void main(String arg[])
	{
		bbb b = new ccc();
		b.add();
		
		Overtest bb = new Overtest();
		bb.ajay(10 , 20 , 40);
		
		String sb = new String("ashish");
		String temp = sb.replace('s', 'm');
		System.out.println(temp);
	}
}
