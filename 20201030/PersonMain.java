
public class PersonMain {

	public static void main(String[] args) {
		// Person 생성자
		Person p = new Person();
		Person b = new Person();

		// p.age = -9999;
		p.setAge(30);
		p.setName("홍길동");
		p.printInfo();

	}

}
