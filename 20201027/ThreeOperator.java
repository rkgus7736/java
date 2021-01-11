import javax.swing.JOptionPane;
public class ThreeOperator {

	public static void main(String[] args) {
	   int num = Integer.parseInt(JOptionPane.showInputDialog("숫자입력"));
	   String result = num % 2 == 0 ? "짝수" : "홀수";
		   System.out.println("입력하신 숫자는" +result+ "입니다.");

	}

}
