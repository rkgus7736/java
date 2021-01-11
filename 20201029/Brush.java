
public class Brush {

  //제품번호
	int BrushNo;
  //제품명
	String BrushName;
  //소비자가
  int price;
  //제조사
  String maker;
  
  public void showProductInfo() {
		 System.out.println("제품번호 :"+BrushNo);
		 System.out.println("제품명 :"+BrushName);
		 System.out.println("소비자가:"+price);
		 System.out.println("제조사:"+maker);
	
  }
}
