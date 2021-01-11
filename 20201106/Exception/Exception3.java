package Exception;

public class Exception3 {

	
	public static void methodA()throws Exception{
			methodB();
		}

	public static void methodB()throws Exception{
				methodC();
	}

	public static void methodC()throws Exception{
				// Exception e = new Exception();
				// throw e;
		throw new Exception ("methodC Exception");

	}

	public static void main(String[] args) {
			try {
				
				methodA();
				
			} catch(Exception e) {
				System.out.println("메인에서 처리");
			}
		}
		}