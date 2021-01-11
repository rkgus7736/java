import java.util.Scanner;

public class MethodEx1 {
	/*
	 * 반지름 하나를 받아서 원넓이를 리턴해주는 메서드
	 */
	public static double calcCirleArea(int r) {
		// 실수라서 double,반지름 값은 정수면 int 실수면 double
		return r * r * 3.14;

	}

	/*
	 * 정수하나를 매개변수로 받아서 해당점수의 팩토리얼 값을 리턴해주는 메서드
	 */
	public static int factorial(int n) {
		int result = 1;
		for (int i=1;i<=n;i++)
			result *=i;
			return result;
		
	}
	/*
	 * 정수 하나를 매개변수로 받아서 해당 점수의 성적등급을 리턴
	 *  90~100 A
	 *  80~89  B
	 *  70~79  C
	 *  60~69  D
	 *  0~59   F
	 */
	public static char getGrade (int score) {
		//등급은 문자이기 때문에 Char 이나 ''로 묶어서 
		 char grade = 'F';
		 //리턴 해둘 값을 지정해두고 나머지 실행
		 
		 if(score >= 90)
			 grade = 'A';
		 else if(score >= 80)
			 grade = 'B';
		 else if(score >= 70)
			 grade = 'C';
		 else if(score >= 60)
			 grade = 'D';
		 
		 return grade;
		 //리턴이 중간에 있을경우 뒤에 있는 코드는 생략된다. 
		
	}
	
	
	public static void main(String[] args) {
      System.out.println("반지름 5의 원넓이: " +calcCirleArea(5));
      System.out.println("반지름 6의 원넓이: " +calcCirleArea(6));
      System.out.println("반지름 7의 원넓이: " +calcCirleArea(7));
	 System.out.println("5!=" +factorial(5));
	}

	
	

}
