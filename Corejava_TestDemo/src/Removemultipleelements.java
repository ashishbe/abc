
public class Removemultipleelements {

	public static void main(String arg[])
	{
		int[] arr1 = {10,20,15,10,14,15,20,18,18};
		int lenght = arr1.length;
		for( int i = 0 ; i < lenght ; i++ )
		{
			int num1 = arr1[i];
			
			for( int j = i+1 ; j < lenght ; )
			{
				int num2 = arr1[j];
				
				if( num1 == num2 )
				{
					for( int k = j ;  k < lenght-1 ; k++ )
					{
						arr1[k] = arr1[k+1];
					}
					lenght--;
				}
				else
				{
					j++;
				}
			}
		}
		
		for( int i = 0 ; i < lenght ; i++)
		{
			System.out.println(arr1[i]);
		}
	}
}
