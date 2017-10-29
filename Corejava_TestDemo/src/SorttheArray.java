
public class SorttheArray {
	
	public static void main(String arg[])
	{
		final int array[] = {10,15,12,17,5,15,6,25,21};
		int newarray[] = {15 , 20 , 24};
		
		for( int i = 0 ; i < array.length ; i++ )
		{
			System.out.print(array[i]);
		}
		
		
		for(int k = 0 ; k < array.length ; k++ )
		{
			int m = array[k];
			
			for( int l = k+1 ; l < array.length ; l++ )
			{
				int n = array[l];
				
				if( m < n )
				{
					array[k] = array[l];
					array[l] = m;
					m = array[k];
				}
			}
		}
		
		for( int i = 0 ;  i < array.length ; i++ )
		{
			System.out.println(array[i]);
		}
	}

}
