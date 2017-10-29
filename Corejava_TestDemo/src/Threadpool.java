import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TestThread2 implements  Runnable 
{
	String name;
	
	public TestThread2(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
	}
}
public class Threadpool {

	public static void main(String arg[])
	{
		ExecutorService sercices = Executors.newFixedThreadPool(5);
		for( int i = 0 ; i < 5 ; i ++ )
		{
			sercices.submit(new TestThread2("ashish"));
		}
		sercices.shutdown();
	}
}
