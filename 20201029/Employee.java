
public class Employee {
	private int empNo;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	private String name;
	private int department;
	private int position;
	private int salary;

	

	public Employee(int empNo, String name, int department, int position, int salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.department = department;
		this.position = position;
		this.salary = salary;
	}

	public void init(int no, String n, int depart, int pos, int sal) {
		empNo = no;
		name = n;
		department = depart;
		position = pos;
		salary = sal;
	}

	public void showEmployeeInfo() {
		System.out.println("사번 : " + empNo);
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + getDepartmentName());
		System.out.println("직급 : " + getPositionName());
		System.out.println("연봉 : " + salary);
	}

	public String getPositionName() {
		String str;
		switch (position) {
		case 1:
			str = "사장";
			break;
		case 2:
			str = "부장";
			break;
		case 3:
			str = "차장";
			break;
		case 4:
			str = "과장";
			break;
		case 5:
			str = "대리";
			break;
		case 6:
			str = "주임";
			break;
		case 7:
			str = "사원";
			break;
		default:
			str = "직급 코드가 잘못 되었습니다.";
		}
		return str;
	}

	public String getDepartmentName() {
		String str;
		switch (department) {
		case 1:
			str = "총무팀";
			break;
		case 2:
			str = "인사팀";
			break;
		case 3:
			str = "경영지원팀";
			break;
		case 4:
			str = "전산팀";
			break;
		case 5:
			str = "영업팀";
			break;
		case 6:
			str = "마케팅팀";
			break;
		default:
			str = "잘못된 부서코드 입니다.";
		}
		return str;
	}

}
