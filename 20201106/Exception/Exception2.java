package Exception;

public class Exception2 {

	public static void main(String[] args) {

     try {
    	 System.out.println(1);
    	 Exception e = new Exception("고의 예외");
    	 
    	 throw e;
    	// System.out.println(2);
    	 //throw 뒤에 오는 식은 생략됨. catch로 넘어감.
     
     } catch (Exception e) {
    	 System.out.println("예외 발생");
    	 System.out.println(e.getMessage());
    	 
     }
     System.out.println(3);
	}

}
