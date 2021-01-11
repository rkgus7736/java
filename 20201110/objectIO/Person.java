package objectIO;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 537504202637558505L;
	private String name;

	private transient int age ;
	//직렬화 대상에서 빠짐, 파일에 저장이 안됨.

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
