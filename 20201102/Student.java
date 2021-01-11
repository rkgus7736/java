
public class Student {
	private int money;

	public Student(int money) {
		this.money = money;

	}

	// 버스 탑승 -->          생성된 버스만 올수있음
	public void boardingBus(Bus bus) {
		bus.boarding(1350);
		money -= 1350;
	}

	// 지하철 탑승
	public void boardingMetro(Metro metro) {
		metro.boarding(1450);
		money -= 1450;
	}

	public void studentInfo() {
		System.out.println("학생이 소지중인 잔액: " + money);
	}

}
