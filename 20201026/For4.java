import javax.swing.JOptionPane;
public class For4 {
  /*숫자 두개를 입력받은 뒤
 * 작은 숫자부터 큰숫자까지 합을 출력
 * 100 입력
 * 1 입력
 * 1~100까지 합 : 5050 <-----결과
 * 
 */
	public static void main(String[] args) {
		Integer.parseInt(
				JOptionPane.showInputDialog("숫자 입력"));
		
  int n1 = Integer.parseInt(JOptionPane.showInputDialog("숫자입력"));
  int n2 = Integer.parseInt(JOptionPane.showInputDialog("숫자입력"));
  int sum = 0;
  
  if (n1>n2) {
	  //n1 n2값을 서로 교환
	 int temp = n1;
	 n1 = n2;
	 n2 = temp;
  }
  
  for( ;n1 <= n2; n1++) {
	  //초기화 영역 ;n1 조건영역 구분 마지막이 증감영역
	  sum += n1;
  }
  System.out.println(sum);
  
  
	 
  }

	}


