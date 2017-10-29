
public class Findmisingnum {

	public Findmisingnum() {
	
		int x, y ;
		try
		{
			x = 10;
			y = 20;
		}
		catch (Exception e) {
		
		}
	}
	
	public static void main(String str[])
	{
		int array[] = {1,2,3,4,5,6,7,9,10,11,13,14,16,18,19,20 ,21,24,25,27};
		
		for( int i = 1 ; i <= 20 ; i++ )
		{
			boolean b = false;
			for( int j = 0 ; j < array.length; j++ )
			{
				if( i == array[j] )
				{
					b = true;
					break;
				}
			}
			
			if( b == false )
				System.out.println(i);
		}
	}
	
}
