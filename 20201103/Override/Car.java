package Override;

public class Car extends Vehicle {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("차를 타고 달립니다.");
	}

	@Override
	public void vbreak() {
		// TODO Auto-generated method stub
		System.out.println("차를 멈춥니다.");
	}

}
