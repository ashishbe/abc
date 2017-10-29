
class bcf 
{
	public void ashish(Object o)
	{
		System.out.println("Object");
	}
}

public class AccessCustomhashmap extends bcf {


	public void ashish(String str)
	{
		System.out.println("String");
	}
	
	public static void main(String arg[])
	{
		
		AccessCustomhashmap abc = new AccessCustomhashmap();
		abc.ashish(null);
		
		CustomHashmap<Integer, Integer> hm = new CustomHashmap<Integer, Integer>();
		hm.put(5, 9);
		hm.put(15, 19);
		hm.put(25, 29);
		hm.put(5, 59);
		hm.put(55, 79);
		hm.put(75, 99);
		hm.put(55, 79);
		
		System.out.println("value coresponding to 5 "+hm.get(5));
		System.out.println("value coresponding to 15 "+hm.get(15));
		System.out.println("value coresponding to 25 "+hm.get(25));
		System.out.println("value coresponding to 55 "+hm.get(55));
		System.out.println("value coresponding to 75 "+hm.get(75));
		
		System.out.println("displaying...");
		hm.display();
		
		

	}
	
}
