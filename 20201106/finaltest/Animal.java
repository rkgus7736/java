package finaltest;

public final class Animal {
	// 클래스 앞에 final을 붙이면 상속불가
 
	public final void printAnimal() { // 상속은 가능하나 재구현이 불가능
		System.out.println("printAnimal");

	}

}
