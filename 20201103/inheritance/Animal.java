package inheritance;

public class Animal {

	protected int age;
    protected String kind; 
	//private int age;하면 Person의 setAge같은 일이 생겨서 protected 써줘야함
	//protected는 유산같은 개념. 자식들도 접근 가능


	public Animal(int age) {
		super();
		this.age = age;
		System.out.println("Animal(int age) Constructor");
	}
	public Animal(String kind) {
		super();
		this.kind = kind;
		System.out.println("Animal(String kind) Constructor");
	}
   public void printAnimalInfo() {
	   System.out.println("이 동물의 나이 : "+age);
	   System.out.println("이 동물의 종류 : "+kind);
   }
 
	
}
