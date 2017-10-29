
public class Test2 {

	public static void main(String[] args) {
		
			String str = "ashish";
			Object o = str;
			
			if( str.equals(o) )
			{
				System.out.println("a");
			}
			else
			{
				System.out.println("b");
			}
		
			if( o.equals(str) )
			{
				System.out.println("a");
			}
			else
			{
				System.out.println("b");
			}
	}

}
