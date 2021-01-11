package sync;

public class Bank {
  private int money;
  
  
  public synchronized void inputMoney(int money) {
	  this.money += money;
	  //입금 되는 돈을 계속 +시킬것
	  System.out.println("입금 결과 :"+ this.money);
	  
  }
}
