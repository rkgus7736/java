package inheritance;


public class InheritanceMain {
	//생성과정에서는 부모 클래스가 먼저 생성, 그 후 자식 클래스가 생성

	public static void main(String[] args) {
		Person p = new Person(20);
		System.out.println("-----------");
		Dog d = new Dog("Pomeranian",3);
		System.out.println("-----------");
		Person p1 = new Person(30);
		p1.printAnimalInfo();
		System.out.println("-----------");
		Dog d1 = new Dog("Pomeranian",5);
		d1.printAnimalInfo();
		System.out.println("-----------");
		
		}
	}


