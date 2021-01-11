package sync;

public class Person extends Thread {
	private Bank bank;

	public Person(Bank bank) {
		this.bank = bank;

	}

	public void inputMoney(int money) {
		bank.inputMoney(1000);
	}
}
