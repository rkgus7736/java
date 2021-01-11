import javax.swing.JOptionPane;
   public class ReviewMain {

	public static void main(String[] args) {
	 
	
	 int n=0;
	 n = Integer.parseInt(JOptionPane.showInputDialog("숫자 입력"));
	 int result = n * n;
	System.out.println("입력하신 숫자의 제곱 : " +result);
	if(result >= 50) {
		System.out.println("결과가 50이상입니다.");
	}else if(result >= 20) {
		System.out.println("결과가 20이상입니다.");
	}else {
		System.out.println("결과가 20미만입니다.");
		
	
	
	
	}
	}
	
	
}
