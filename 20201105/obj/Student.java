package obj;

public class Student {

	// 학번
	private String sno;
	// 이름
	private String name;
	// 전공
	private String major;
	// 평점
	private double score;

	// 생성자
	public Student(String sno, String name, String major, double score) {
		super();
		this.sno = sno;
		this.name = name;
		this.major = major;
		this.score = score;
	}

	// 초기화
	public void init(String s, String n, String m, double sc) {
		sno = s;
		name = n;
		major = m;
		score = sc;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	// 학생 정보 출력
	public void printStudentInfo() {
		System.out.println("학번 : " + sno);
		System.out.println("이름 : " + name);
		System.out.println("전공 : " + major);
		System.out.println("평점 : " + getGrade() + "(" + score + ")");
	}

	public String getGrade() {
		if (score == 4.5)
			return "A+";
		else if (score >= 4.0)
			return "A";
		else if (score >= 3.5)
			return "B+";
		else if (score >= 3.0)
			return "B";
		else if (score >= 2.5)
			return "C+";
		else if (score >= 2.0)
			return "C";
		else if (score >= 1.0)
			return "D";
		else
			return "F";
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", major=" + major + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((major == null) ? 0 : major.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((sno == null) ? 0 : sno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		// 주소비교
		if (this == obj)
			return false;
		// null 체크
		if (obj == null)
			return false;
		// 안넣어도되지만 필요할때 안넣으면프로그램터짐
		// obj가 형변환이 되는지?
		if (!(obj instanceof Student))
			return false;
		if (obj instanceof String) {
			if (obj.equals(sno))
				return true;
		} else {
			Student temp = (Student) obj;
			if (sno.equals(temp.sno))
				return true;
		}
		return false;
	}

}
