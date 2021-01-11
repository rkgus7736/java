package Student;

public class Student {
	protected String sno;
	// 이름
	protected String name;
	// 과목
	private Subject subject;

	// 생성자
	public Student(String sno, String name, Subject subject) {
		this.sno = sno;
		this.name = name;
		this.subject = subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	// 학생정보출력
	public void printInfo() {
		System.out.println("학번:" + sno + "이름:" + name + "과목:" + subject);
		subject.printInfo();

	
	}

}
