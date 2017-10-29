
public class Swappinginarray {

	
	public static void main(String arg[])
	{
		char arr[] = {'a','b','c','d','e','f','g','h','i','j','k'};
		
		char temp;
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for( int j = i+1 ; j < arr.length ; j++)
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i = i + 3;
				break;
			}
		}
		
		for( int i = 0 ; i < arr.length; i++ )
		{
			System.out.print(arr[i]);
		}
	}
}
