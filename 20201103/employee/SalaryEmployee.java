package employee;

public class SalaryEmployee extends Employee{
	private int incenPoint;

	public SalaryEmployee(int sno, String name, int salary, int incenPoint) {
		super(sno, name, salary);
		this.incenPoint = incenPoint;
	}
	
	public int calcInecentive() {
		return (int)(incenPoint * 0.2);
	}
	
	@Override
	public void printEmpInfo() {
		super.printEmpInfo();
		System.out.println("인센티브 : "+calcInecentive());
	}
}