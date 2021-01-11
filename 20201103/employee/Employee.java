package employee;

public class Employee {
	protected int sno;
	protected String name;
	protected int salary;
	
	
	public Employee(int sno, String name, int salary) {
		super();
		this.sno = sno;
		this.name = name;
		this.salary = salary;
	}
	
	public void printEmpInfo() {
		System.out.println("사원번호:"+sno);
		System.out.println("사원이름:"+name);
		System.out.println("연봉"+salary);
		
	}
	public int calcBonus() { 
		 return (int) (salary * 0.3);
		 //정수 * 0.3 이라서 double이어야 하는데 
		 //정수로 제시했으니 return뒤에 (int)를 쓰면서 
		 //강제로 형변환 시켜줘야함
	}

	
		
	}


