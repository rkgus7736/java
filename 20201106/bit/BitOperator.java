package bit;

public class BitOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 15;
		int n2 = 20;
		
		//10진수로 표현 (비트연산이 어떻게 되는지 알기위해)   8421
		//15 -  0000 0000 0000 0000 0000 0000 0000 1111
		//20 -  0000 0000 0000 0000 0000 0000 0000 0100
		//and - 0000 0000 0000 0000 0000 0000 0000 0100 - 4
		// or - 0000 0000 0000 0000 0000 0000 0001 1111 - 31
		//xor - 0000 0000 0000 0000 0000 0000 0001 1011 - 27
		//not - 1111 1111 1111 1111 1111 1111 1111 0000 
        //not은 거꾸로 뒤집는거기 때문에 0이 1로 변함
		//1보수 - 1000 0000 0000 0000 0000 0000 0000 1111
		//2보수 - 1000 0000 0000 0000 0000 0000 0001 0000 - 16
		// not,1보수,2보수 맨앞이 1이면 음수 (몰라도 됨)
		 
		// bit - and
		System.out.println(n1 & n2);
		// bit - or
		System.out.println(n1 | n2);
		// bit - xor
		System.out.println(n1 ^ n2);
		// bit = not
		System.out.println(~n1);
	}

}
