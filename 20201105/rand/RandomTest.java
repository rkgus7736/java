package rand;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		// 0~10
		System.out.println(r.nextInt(10));
		// 50~99 정수를 뽑는 식을 완성
		// 0~49 + 50
		// r.nextInt(최대값 + 최소값 +1)+최소값
		System.out.println(r.nextInt(50));
		System.out.println(r.nextInt() % 50 + 50);
		
		for(int i =0;i<20;i++)
			System.out.println(r.nextInt());

	}

}
