
public class Seller {
	
   //보유하고 있는 제품수
	private int product;
   //보유중인 금액
	private int money;
   //제품 단가
	private final int PRODUCT_PRICE;
	
	
	public Seller(int product, int money, int pRODUCT_PRICE) {
		super();
		this.product = product;
		this.money = money;
		PRODUCT_PRICE = pRODUCT_PRICE;
	}
	
	public int sell(int money) {
		this.money += money;
		return money / PRODUCT_PRICE;
		//동시에 값을 두개 이상 넘겨줄 방법이 아직 없어서 잔돈은 없다는 가정
		
	}
	public void sellInfo() {
		System.out.println("제품 재고:"+product);
		System.out.println("잔고:"+money);
		
	}
		

	}


