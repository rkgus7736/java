import javax.swing.JOptionPane;
public class While4 {

	public static void main(String[] args) {
		int i=0;
	 int sum = 0;
	 while(i<5) {
		int n= Integer.parseInt(JOptionPane.showInputDialog("숫자입력"));
		 sum += n;
		 i++;
		
	 }
		
	 System.out.println(sum/5.0);
		
	}
	}


