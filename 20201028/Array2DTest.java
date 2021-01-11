
public class Array2DTest {

	public static void main(String[] args) {
		int[][] arr = new int[3][4];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
//2차원 배열 행과열개념으로 번호가 두개가 감 (인덱스 = 번호표)
}
