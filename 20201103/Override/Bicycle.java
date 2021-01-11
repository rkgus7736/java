package Override;

public class Bicycle extends Vehicle {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("자전거를 타고 달립니다.");
	}

	@Override
	public void vbreak() {
		// TODO Auto-generated method stub
		System.out.println("자전거를 멈춥니다.");
	}

}
