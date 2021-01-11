
public class FinalMember {
	 private final int MEMBER_AGE=100;
	 //상수를 선언할 때 무조건 대문자 
	 //합성어 사이사이 _만 넣어주면 된다
	 //값을 나중에 넣을거면 생성자를 무조건 만들어줘야하고
	 //값을 미리 넣을거면 생성자를 만들지 않아도 된다
	 private final int MAX_AGE;
	 
	 public FinalMember() {
		 MAX_AGE = 200;
	 }
		 public FinalMember(int maxAge) {
			 super();
			 MAX_AGE = maxAge;
			 
		 }
	 
	 
	}
	

