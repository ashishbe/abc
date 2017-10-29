
class abcccc extends Thread 
{
	@Override
	public void run() {
		
		for( int i = 0 ; i < 10 ; i++ )
		{//Thread.yield();
			System.out.println("child thread :"+(i+1));
		}
	}
}


public class Test23 {
	
	public enum Season { WINTER, SPRING, SUMMER, FALL }
	
	public static void main(String arg[]) throws InterruptedException
	{
		abcccc abc = new abcccc();
		Thread tt = new Thread(abc);
//		tt.setPriority(2);
		tt.start();
		
		tt.join();
		
		for( int i = 0 ; i < 10 ; i++ )
		{
			System.out.println("main thread :"+(i+1));
		}
	}
}
