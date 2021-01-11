
public class PersonMain {

	public static void main(String[] args) {
		//Person p= new Person() {
	    //private이라서 안보이는것
		Person p = Person.getInstance();
		Person b = Person.getInstance();
		Person c = Person.getInstance();
		Person d = Person.getInstance();
		Person e = Person.getInstance();
	    System.out.println(p);
	    System.out.println(b);
	    System.out.println(c);
	    System.out.println(d);
	    System.out.println(e);
		}

	}


