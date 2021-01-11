package sync;

public class ThreadWorker extends Thread{

	public void run() {
		try {
			for (int i=0; i<10; i++)
				System.out.println(getName()+""+i);
				Thread.sleep(500);
				this.yield();
				
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName()+" exit");
		}
 
}
