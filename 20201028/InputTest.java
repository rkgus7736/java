import java.util.Scanner;

import javax.swing.JOptionPane;
public class InputTest {

	public static void main(String[] args) {
		String str;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		num= sc.nextInt();
		sc.nextLine();
		System.out.println(num);
		System.out.print("숫자 입력: ");
		num= sc.nextInt();
		sc.nextLine();
		System.out.println(num);
		System.out.print("숫자 입력: ");
		num= sc.nextInt();
		sc.nextLine();
		System.out.println(num);
		System.out.print("숫자 입력: ");
		num= sc.nextInt();
		sc.nextLine();
		System.out.println(num);
		
		System.out.println("문자열 입력: ");
		str =sc.nextLine();//문자열 입력 한줄씩 읽어줌
		System.out.println("입력한 문자열:"+str);
	}

}
