import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//길이가 5인 배열 생성 배열길이생략
		int[]a = new int[] {12,32,31,13,11};
				
		//길이 7인 배열 생성 new int 생략가능
		int []b= {2,3,4,5,6,7,8};
		 int[] c = new int [10];
		for (int i=0;i<c.length;i++) {
			c[i]=i;
			
		}
		//for문으로 배열 초기화
		System.out.println("");
		System.out.println(Arrays.toString(c));//for문을 이용한 출력
		
	}

}
