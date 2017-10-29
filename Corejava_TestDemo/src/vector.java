import java.util.Vector;

public class vector {

	public static void main(String arg[])
	{
		Vector v = new Vector(24);
		System.out.println(v.capacity());
		
		for( int i = 0 ; i < 25 ; i++)
		{
			v.addElement("ashish");
		}
		System.out.println(v.capacity());
		v.addElement("ashish");
		System.out.println(v.capacity());
	}
}
