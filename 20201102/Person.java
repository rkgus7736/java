
public class Person {
	private static Person instance = new Person();

	private Person() {
		System.out.println("Person Constructor");
		// 외부에서 클래스를 만들수없게 막아버릴 것
		// private은 클래스 내부에서만 사용가능한 것
		// 위에서 static이 있기 때문에 상관없음
	}

	public static Person getInstance() {
		// 외부에서는 이걸로 접근
		// 가져가서 만들수있게끔 (보기 드물수있음)
		if (instance == null)
			instance = new Person();

		return instance;

	}

}