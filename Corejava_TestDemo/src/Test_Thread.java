class abc extends Thread
{
	public abc() {
		System.out.println("thread constructor");
	}
	
	@Override
	public void run() {
		
		for( int i = 0 ; i < 10 ; i++ )
		{
			System.out.println(Thread.currentThread()+" "+i);
		}
	}
}

class bcd implements Runnable
{
	public bcd() {
		System.out.println("runnable constructor");
	}

	public void run() {
		
		for( int i = 0 ; i < 10 ; i++ )
		{
			System.out.println(i);
		}
	}
}

public class Test_Thread {

	public static void main(String arg[]) throws InterruptedException
	{
		abc a = new abc();
		abc a1 = new abc();
		abc a2 = new abc();
		Thread tt = new Thread();

		a.setName("thread1");
		a1.setName("thread2");
		a2.setName("thread3");
		
		a.start();
		a.join();
		a1.start();
//		a1.yield();
//		a2.start();
		
//		bcd b = new bcd();
//		Thread tt = new Thread(b);
//		tt.start();
		
//		tt.setPriority(0);
		
		System.out.println("priority "+tt.getPriority());
		
	}
}
