package isa;
//반드시 쓸 일 있으니 꼭 기억할 것 
public class CastingMain {

	public static void main(String[] args) {
		Animal animal = null;
		Person p = new Person();
		Dog d= new Dog();
		
		//자식 클래스는 부모 클래스로 형변환이 가능함
		//Up Casting
		animal = p;
		animal = d;
		
		//부모 클래스가 자식 클래스로 형변환
		//Down Casting
		System.out.println(animal);
		Dog r = (Dog) animal;
	//	Person s = (Person) animal;
		//(Dog)을 써줘야함
		
		System.out.println(animal instanceof Animal);
		System.out.println(animal instanceof Person);
		System.out.println(animal instanceof Dog);
		
		use(new Person());
		use(new Dog());
	}
	public static void use(Animal a) {
		//instanceof 상속 관계에서만 사용이 가능
		if (a instanceof Person) {
			Person p = (Person) a;
			p.printPerson();
		}else if (a instanceof Dog) {
			Dog d = (Dog) a;
			d.printDog();
			
		}
	}

}
