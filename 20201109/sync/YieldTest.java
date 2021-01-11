package sync;

public class YieldTest {
 
	 public static void main(String[]args) throws InterruptedException {
		 ThreadWorker t1 = new ThreadWorker();
		 ThreadWorker t2 = new ThreadWorker();
		 t1.start();
		 t2.start();
		 t1.join(5000);//메인이 얘가 처리 될때까지 해당시간동안만 기다리겠다
		 t2.join();//t2가 끝날때까지 대기
		
	
		 
		 System.out.println("main - exit");
	 }
}
