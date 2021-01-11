
public class Card {
	/*
	 * 카드번호 : 정수 고객명 : 문자열 이용한도: 정수
	 */

//생성자
	private int cardNo;
	private String clientName;
	private int moneylimit;

	public Card(int cardNo, String clientName, int moneylimit) {
		super();
		this.cardNo = cardNo;
		this.clientName = clientName;
		this.moneylimit = moneylimit;
	}

//카드번호 출력
	public void cardInfo() {
		System.out.println("카드 번호:" + cardNo);
		System.out.println(" 고객명 :" + clientName);
		System.out.println("이용 한도:" + moneylimit);

	}

}
