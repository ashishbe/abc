
class A 
{
		public synchronized void abc( B b )
		{
			System.out.println("start a");
			
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e) {
				System.out.println("a catch");
			}
			System.out.println("inside a");
			b.last();
		}
		
		public synchronized void last()
		{
			System.out.println("inside a this is last");
		}
}

class B
{
	public synchronized void abc1( A a )
	{
		System.out.println("Start b");
		
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e) {
			System.out.println("B catch");
		}
		
		System.out.println("inside b");
		a.last();
	}
	
	public synchronized void last()
	{
		System.out.println("inside a this is last");
	}
}

public class ThreadDeadLock extends Thread{
	
	A a = new A();
	B b = new B();
	
	public ThreadDeadLock()
	{
		this.start();
		b.abc1(a);
	}
	
	public static void main(String ar[])
	{
		new ThreadDeadLock();
	}
	
	public void run()
	{
		a.abc(b);
	}

}
