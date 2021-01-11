
public class NumberMain {

	public static void main(String[] args) {
		System.out.println(Number.count);
		Number n1=new Number(5);
		Number n2=new Number(15);
		Number n3=new Number(52);
		Number n4=new Number(54);
		System.out.println(Number.count);
		
		//System.out.println(n1.getCount());
		// static으로 불러낼건데 굳이 찍어내겠다.
		//둘 다 쓸수있지만 주로 윗줄을 쓰게 될것.
		//미리 만들어져있다면 둘 다 사용가능

	}

}
