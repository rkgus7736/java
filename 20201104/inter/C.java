package inter;

public interface C extends A,B {
	//인터페이스는 2개이상의 인터페이스 상속가능
	default void printC() {
		System.out.println("C");
	}

	default void printA() {
		printA();
	}
}
