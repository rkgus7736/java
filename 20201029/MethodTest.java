import java.util.Scanner;

public class MethodTest {
	// method(기능): 하나의 기능을 담당하는 코드
	/*
	 * 리턴타입 메서드명(매개변수){ 실행문 [return;]//결과물을 받을지말지,받는다면 어떻게 받을지 정해주는게 return }
	 */
	// 리턴 X, 매개변수 X
	public static void firstMessage() {
		System.out.println("첫번째 메서드");
		// 하청후 재하청하는 곳(받는것도 없고 결과 주는것도 없다.)

	}

	// 리턴 O, 매개변수 X
	public static int inputNumber() {
		// int로 입력했으면 int , double 이었으면 double로 문자열 통일해줘야함
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력: ");
		int num = sc.nextInt();
		return num;
	}

	public static int minus(int n1, int n2) {
    int result = n1-n2;
    return result;
	}
	public static void printResult(int result) {
		System.out.println("출력 결과:" + result);
		
	}

	public static void main(String[] args) {
		firstMessage();
		int n1 = inputNumber();
		int n2 = inputNumber();
		int result = minus(n1,n2);
		System.out.println(result);

	}

}
