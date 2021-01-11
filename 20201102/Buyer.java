
public class Buyer {

	private int money;
	private int product;

	public Buyer(int money) {
		this.money = money;
		// 일단 돈만 많은 상태. 구매하는 기능을 만들어줘야함
	}
    //                     변수-->직접 생성 X
	//                     외부에서 이미 생성된 것을 받아옴.
	public void buy(Seller seller, int money) {
		// 외부에서 셀러를 부를거라서 Seller seller, 
		// 돈이 있다는걸 한번 더 보여줌 int money
		int ea = seller.sell(money);
		product += ea;
		this.money -= money;

	}

	public void buyerInfo() {
		System.out.println("현재 보유중인 제품수:" + product);
		System.out.println("현재 남은 잔액:" + money);

	}
}
