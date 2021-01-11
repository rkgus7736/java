package Thread;

public class ThreadWorker extends Thread {
	public void run() {
		// 자동으로 동시에 일이 진행되는 부분
		for (int i = 0; i < 1000000; i++)
			;
		System.out.println(getName() + "Thread exit");
		// thread 하나 만들기 끝
		try {
			Thread.sleep(5000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public ThreadWorker(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

}
