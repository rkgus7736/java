package inter;

//인터페이스 B가 인터페이스 A를 상속받았다.
public interface B extends A {
	default void printB() {
		System.out.println("B");
		// printA(); -> 인터페이스 A를 상속받았기 때문에 사용가능
	}

	default void printA() {
		printA();
	}
}
