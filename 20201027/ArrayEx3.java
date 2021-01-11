import javax.swing.JOptionPane;
public class ArrayEx3 {

	public static void main(String[] args) {
		/* 
		 * 정수형 배열 10개 선언 후
		 * 정수형 배열에 숫자를 전부 입력
		 */
     
	 
	 // 0~9까지 = 총 10개   개수
	 int [] arr= new int [10];
	 
	 for (int i=0; i<10; i++) {
		 arr[i]=Integer.parseInt(JOptionPane.showInputDialog(i + "번째 숫자입력"));
	 
	}

	// 배열의 총합 출력
	
	    int sum = 0;
		for(int i=0;i<10;i++) {
		   sum += arr[i];	

			}
		System.out.println("총합:"+sum);
        
		int max = arr[0];//초기화
		int min = arr[0];//초기화
		
		for (int i=1 ;i < 10 ; i++) {
			if (max < arr[i])
				max= arr[i];
			if (min > arr[i])
				min= arr[i];
			
		}
	System.out.println("최대값 :" +max);
	System.out.println("최소값 :" +min);
	
	}
	
	
	 
	}

	
