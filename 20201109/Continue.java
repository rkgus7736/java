import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
	int money = 10000;
	Scanner sc = new Scanner (System.in);
	System.out.println("현재 잔고는 10000원");
	
   while (true) {
	   System.out.println("얼마를 사용하시겟습니까?");
	    int i = sc.nextInt();
	    
	    if (!(0<=i && i<=10000))
	    	System.out.println("잔고를 넘어섰어요 다시입력");
	        System.out.println("");
	        continue;
   }
	        System.out.printf("잔액 %d원 :\n",money-=i);
	        if (money==0);
	        break;
	        
	        
   }
 System.out.println("종료");
	
}
}
