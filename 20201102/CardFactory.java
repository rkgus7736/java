//싱글톤 패턴을 적용
public class CardFactory {

	// 카드번호 : 정수
	private static CardFactory instance = new CardFactory();
	private int cardNo;

	// 생성자 ()--> 카드번호=2000
	public CardFactory() {
		cardNo = 2000;
	}

	public static CardFactory getInstance() {
		if(instance == null)
			instance = new CardFactory();
		return instance;
	}
	//카드 생성(고객명,이용한도):card
	// 카드 생성시 카드번호 자동으로 1씩 증가
	public Card createCard(String clientName, int limit) {
		//Card card=new card(cardNo++,client,limit);
		//cardNo++;
		return new Card (cardNo++,clientName,limit);
	    
	}

	
}