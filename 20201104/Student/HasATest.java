package Student;

public class HasATest {

	public static void main(String[] args) {
	  Subject s1 = new Subject("국어",78);
	  Subject s2 = new Subject("수학",88);
	  Subject s3 = new Subject("영어",62);
	  Subject s4 = new Subject("과학",91);
	  
	  Student student = new Student("74160220","신가현",s1);
	  student.printInfo();		  
	  student.setSubject(s2);
	  student.printInfo();
	  student.setSubject(new Subject("프랑스어",77));
	  //할때마다 실행시킬수있다.
	  student.printInfo();
	  SubjectVer02 s5 = new SubjectVer02("경제",68);
	  student.printInfo();
	}

}
