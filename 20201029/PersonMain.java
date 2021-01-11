
public class PersonMain {

	public static void main(String[] args) {
	  Person p = new Person();
	  //new 가 없으면 실체가 없어서 에러가 남
	  
	  p.name = "홍길동";
	  p.age = 20;
	//p.init("홍길동",20);으로 줄여서 출력 가능
	  
	  System.out.println(p.name);
	  System.out.println(p.age);
          
	  Person a = new Person();
	  Person d = new Person();
	  a.name = "김철수";
	  a.age = 33;
	  d.name = "홍철수";
	  System.out.println(a.name+a.age);
	  System.out.println(d.name+d.age);
	  
      System.out.println(p);
      System.out.println(a);
      System.out.println(d);
	
	
	}
	}   

