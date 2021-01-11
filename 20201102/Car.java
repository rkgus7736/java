
public class Car {

	private int gear;
	// gear는 만든 사람이나 자동차 입장에서 생각해봐야함.
	// (사용자 입장 X,사용자 입장에서는 문자로만 보이면 됨)
	private int speed;
	private int fuel;
	private boolean wiper;
	private char[] gearList;

	public Car() { // 초기화 값
		gear = 1; // P기어로 초기화
		speed = 0; // 처음엔 안달리니까
		fuel = 50;
		gearList = new char[] { 'R', 'P', 'N', '1', '2', '3', '4', '5', '6' };

	}

	public void changeGear(int g) {
		// 기어 변경
		gear = g;

		// 변경된 기어를 출력
		// 출력할때도 0의 결과값은? 1의 결과값은? 생각해보면 좋음.
		System.out.println("변경된 기어 :" + gearList[gear]);
	}

	public void accelator() {
		if (fuel <= 0) {
			System.out.println("연료가 없습니다.");
			speed = 0; // 연료가 없으면 달릴수 없어서 speed '0'
			return;
		}
		fuel -= 2;// (2씩 감소)
		speed += 3;// (3씩 증가)
		System.out.println("현재 속도 :" + speed);
	}

	public void carBreak() {
		if (fuel <= 0) {
			System.out.println("연료가 없습니다.");
			speed = 0; // 연료가 없으면 달릴수 없어서 speed '0'
			return;
		}
		fuel -= 1;
		speed += 5;
		System.out.println("현재 속도 :" + speed);
	}

	public void inputFuel() {
		fuel = 50;
		System.out.println("연료 충전 완료");
	}

	public void wiperOnOff() {
		wiper = !wiper;
		if (wiper)
			System.out.println("와이퍼 On");
		else
			System.out.println("와이퍼 Off");
	}

}