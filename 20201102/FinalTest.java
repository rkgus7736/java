import javax.swing.JOptionPane;

public class FinalTest {

	public static void main(String[] args) {
		// 상수
		final double pi = 3.1415;
		//절대 안바뀌는 값 (final 이라는 키가 붙으면 변수의 값이 변하지못함.고정시키는 것)
		//pi = 2.141325;는 에러남
        System.out.println(5*5*pi);
        
        
        // 나중에 받아온 데이터 값으로 값을 정하고 싶다면
        num = Integer.parseInt(JOptionPane.showInputDialog("숫자입력"));
     
        num = 123;
        //두번째부터 넣는건 막는다 (final은 딱 한번만 저장된 값을 받음)
        
	}

}
