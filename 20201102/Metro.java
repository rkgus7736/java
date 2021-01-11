
public class Metro {
	private int money;
	private int passengerCount;
//처음에 돈과 승객이 0이라 생성자 필요없음

	public void boarding(int money) {
		this.money += money;
		passengerCount++;
	}

	public void printMetroInfo() {
		System.out.println("운행 수입:" + money);
		System.out.println("이용객 숫자:" + passengerCount);
	}

}

