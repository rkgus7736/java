package Thread;

public class RunMain {

	public static void main(String[] args) {
		ThreadRun t1= new ThreadRun("t1");
		t1.setPriority(Thread.MAX_PRIORITY);
		//첫번째를 맥스로 줬다
		ThreadRun t2= new ThreadRun("t2");
		t2.setPriority(Thread.MIN_PRIORITY);
		ThreadRun t3= new ThreadRun("t3");
		t3.setPriority(Thread.MIN_PRIORITY);
		ThreadRun t4= new ThreadRun("t4");
		t4.setPriority(Thread.MIN_PRIORITY);
		t1.start();t2.start();t3.start();t4.start();

	}

}
