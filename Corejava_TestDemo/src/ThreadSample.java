
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ThreadSample {
	
	public static void main(String arg[])
	{
		String str = "This is another example";
		
		ArrayList<String> al = new ArrayList<String>(); 
		
		StringTokenizer st = new StringTokenizer(str, "char");
	
		String[] str1 = str.split(" ");
		
		for( int i = str1.length -1 ; i >= 0  ; i-- )
		{
			System.out.println(str1[i]);
		}
		
		System.out.println("string toknizer start");
		while (st.hasMoreElements()) {
			String object = (String) st.nextElement();
			al.add(object);
		}
		
		
		
		for( int i = al.size()-1 ; i >= 0 ; i-- )
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("string toknizer end");
//		
//		
//		for( int i = str.length()-1 ; i >= 0 ; i-- )
//		{
//			if( str.charAt(i) == ' ' || i == 0 )
//			{
//				for( int j = i ; j < str.length() ; j++ )
//				{
//					if( str.charAt(j) != '\t' )
//					{
//						System.out.print(str.charAt(j));
//					}
//				}
//				
//				System.out.print(" ");
//			}
//		}
		
		int arr[] = {1,2,3,1,3,6,6};
		
		for( int i = 0 ; i < arr.length ; i++ )
		{
			for( int j = i+1 ; j < arr.length ; j++ )
			{
				if(arr[i] == arr[j])
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}

}
