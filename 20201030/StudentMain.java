
public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student("74160220", "신가현", "실용무용학과", 89);
		// Student std = new Student();// 기본생성자는 생성자를 직접 만들면 자동 추가 안됨
		student.printStudentInfo();
	}

}
