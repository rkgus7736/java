
public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeFactory factory = EmployeeFactory.getInstance();
		// 직원 3명을 생성
		Employee e1 = factory.createEmployee("홍길동", "경영지원팀", 4200);
		Employee e2 = factory.createEmployee("고길동", "총무팀", 4300);
		Employee e3 = factory.createEmployee("이길동", "인사팀", 4400);

		e1.printInfo();
		e2.printInfo();
		e3.printInfo();
	}

}
