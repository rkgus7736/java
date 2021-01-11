package Thread;

public class RunnableWorker implements Runnable {

	public void run() {
		// 자동으로 동시에 일이 진행되는 부분
		for (int i = 0; i < 1000000; i++)
			;
		System.out.println(Thread.currentThread().getName());

	}
}