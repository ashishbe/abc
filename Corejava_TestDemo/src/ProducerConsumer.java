
public class ProducerConsumer {

	public static void main(String arg[]) throws InterruptedException
	{
		Consumer con = new Consumer();
		con.start();
		
		synchronized (con) {
			System.out.println("main thread wait to call wait");
			con.wait();
			System.out.println("main thread got notification");
			System.out.println(con.total);
		}
	}
	
}

class Consumer extends Thread
{
	int total = 0;
	public void run() {

		synchronized (this) {
			
			System.out.println("child class start notification");
			for( int i = 0 ; i <= 10 ; i++ )
			{
				total = total + i;
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("child class trying to give notification");
			
			this.notify();
		}
	}
}
