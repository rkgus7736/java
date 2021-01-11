package Exception;

public class CatchTest {

	public static void main(String[] args) {
		int arr[] = new int[3];
		try {
			System.out.println(1);
			int r = arr[3] % 4;
			System.out.println(2);

		} catch (ArithmeticException e) {
			System.out.println(3);
		}catch (IndexOutOfBoundsException e) {
			System.out.println(4);
			//무슨 에러가 날지 모르겠으면 catch (Exception e)하면 됨

		} finally {
			System.out.println(5);

		}
		System.out.println(6);
	}

}
