
public class Date1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		long start = System.nanoTime();
	
		System.out.println(
				"시작시간:" + start);
		int a = 0;
		for (int i = 1; i < 10000000; i++) {
			a++;
		}
		long end = System.nanoTime();
		System.out.println("종료시간:" + end);
		System.out.println("걸린 작업 시간:" + (end - start));
		
		//System.out.println(System.currentTimeMillis());
		//System.out.println(System.nanoTime());
		//currenttimemiilis는 타입이 int가 아니라 long이다
		//system.nanotime은 

	}

}
