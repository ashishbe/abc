class bcdd implements Runnable 
{
 	@Override
 	public void run() {
 		for( int i = 0 ; i < 10 ; i++)
 		{
 			System.out.println("child thread " + Thread.currentThread()+" "+i);
 		}
 	}
}
public class TestThread {

	public static void main(String arg[]) throws InterruptedException
	{
		bcdd bc = new bcdd();
		Thread t1 = new Thread(bc);
		Thread t2 = new Thread(bc);
		Thread t3 = new Thread(bc);
		t1.start();
		t1.join();
		t2.start();
		t2.yield();;
		
		t3.start();	
//		
//		t3.join();
		
// 		for( int i = 0 ; i < 10 ; i++)
// 		{
// 			System.out.println("main method"+" "+i);
// 		}
	}
}
