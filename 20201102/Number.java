
public class Number {
 private int num;
 public static int count = 0;
 
public Number(int num) {
	super();
	this.num = num;
	count++;
	
}
 public static int getCount() {
	 Number.count = count;
	 //this.count=count;(사용가능)
	 //num++;은 사용불가능
	 //가지고 있는 num을 증가시키겠다
	 //num은 new를 사용해야 만들어짐
	 //만들어져 있을수도 있고,만들어져있지않을수있다 
	 //static인 녀석이 static 아닌것에 접근하는 것 
	 //static은 별도의 방이 3개가 있는데 
	 //{}방 하나,static방 하나,new방 하나
	 return count;
  }
  public void printCount() {
	  System.out.println("count:"+count);
	  //static이 아니지만 static에 접근해서 사용 가능함
	  //만들어져 있는 아이
  }
}
