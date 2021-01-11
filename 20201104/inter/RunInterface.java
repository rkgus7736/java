package inter;

public interface RunInterface {
	public static final int MAX_SPEED = 300;

	// private static final int MAX_SPEED =100;
	// private는 사용불가. 인터페이스에서는 무조건 public만 사용가능
	public abstract void run();
	// public 과 abstract 를 지워도 에러없이 실행됨.

}
