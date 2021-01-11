package file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReview {

	public static void main(String[] args) {

		FileWriter fw = null;
		PrintWriter pw = null;

		try {
			// 노드 스트림 연결
			FileWriter fw = new FileWriter("text.txt");
			// 프로세스 스트림 연결
			pw = new PrintWriter(fw);
			// 입출력 처리
			pw.println("Hello World");
			pw.println(24);
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			// close처리
			pw.close();
		}

	}

}
