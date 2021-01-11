
public class CardName {

	public static void main(String[] args) {
		CardFactory factory = CardFactory.getInstance();
		Card card1 = factory.createCard("홍길동", 5000);
		Card card2 = factory.createCard("고길동", 3500);
		Card card3 = factory.createCard("박길동", 4800);
		Card card4 = factory.createCard("김길동", 2000);
		Card card5 = factory.createCard("이길동", 4500);
	
		card1.cardInfo();
		card2.cardInfo();
		card3.cardInfo();
		card4.cardInfo();
		card5.cardInfo();
	

	}

}
