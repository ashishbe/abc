
public class Findmissingnum {

	public static void main(String arg[])
	{
		int arr[] = {1,2,3,4,5,6,7,9,10};
		
		int total = (10 * (10+1))/2;
		
		for( int i = 0 ; i < arr.length ; i++ )
		{
			total = total - arr[i];
		}
		
		System.out.println("missing number is = "+ total);
		
	}
	
}
