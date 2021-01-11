import javax.swing.JOptionPane;

public class While3 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("숫자입력"));
		int i= 1;
		
		while(num > 5) {
			System.out.println("HelloWorld");
			num--;
		}
		
	}

}
