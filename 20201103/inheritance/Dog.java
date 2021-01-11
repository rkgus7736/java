package inheritance;

public class Dog extends Animal {
private String kind;
private int age;

//개의 품종과 나이를 받는 생성자
public Dog(String kind, int age) {
	super(age);
	this.kind = kind;
	this.age= age;
}
//printAnimalInfo --> 오버라이딩(재구현)
//이 개의 품종은 kind, 나이는 ?? 입니다. --> 출력
		
public void printAnimalInfo() {
System.out.println("이 개의 품종은"+ kind +"나이는"+ age +"입니다");

}
}

