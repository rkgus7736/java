package stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		// 스트링 초기화
		try {
			fr = new FileReader("gisa.txt");
			br = new BufferedReader(fr);

			// 파일 읽기
			while (true) {
				String msg = br.readLine();
				if (msg == null)
					break;
				System.out.println(msg);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				System.out.println(fr.ready());
				if (fr != null)
					fr.close();
				// br을 먼저 닫아야하는 이유:오픈 과정이 있으면 클로징 과정이 있다.
				// 노드가 생기고 프로세스가 생겼으니 프로세스 먼저 죽이고 노드를 죽여야함.
				// 프로세스 스트림 종료 하면 노드도 같이 종료

			} catch (IOException e) {

				e.printStackTrace();
			}
		}
//--------------------------------------------------------------
		FileReader fr1 = null;
		BufferedReader br1 = null;

		try {
			fr1 = new FileReader("gisa.txt");

			br1 = new BufferedReader(fr1);
			while (true) {
				String str = br1.readLine();
				if (str == null)
					break;
				System.out.println(str);

			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if (br1 != null)
					br1.close();
				System.out.println(fr.read());
				if (fr != null)
					fr.close();

			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}