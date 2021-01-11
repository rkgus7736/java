package bit;

public class ExceptionTest1 {

	public static void main(String[] args) {
		try {// try에서 오류가 안났으면 빠져나가서 catch로 넘어감
			System.out.println(1);
			int r = 5 / 0;
			System.out.println(2);
			// (2)부분에서 에러가 나서 결과 생략하고 catch로 넘어가는것
		} catch (Exception e) {
			System.out.println(3);
			System.out.println(e.getMessage());
			//
		}
		System.out.println(4);
		// 4가 출력이 된다는건 에러가 있어도 끝까지 실행된다.

	}

}
