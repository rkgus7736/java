package stream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class IOTest {
	public String readline() { // 문자열 한줄 읽어오는 부분
		// 노드 스트림 생성
		InputStreamReader isr = new InputStreamReader(System.in);
		char buffer[] = new char[10];
		String message = null;
		int idx = 0;// 인덱스 번호
		try {
			do {
				if (idx == buffer.length - 1)
					buffer = Arrays.copyOf(buffer, buffer.length + 10);
				buffer[idx] = (char) isr.read();
				idx++;
			} while (buffer[idx-1] != '\n');
			// '\n'이 입력될때까지 입력받겠다.
			System.out.println(Arrays.toString(buffer));
			for (int i=0;i<idx;i++)
				System.out.println((int)buffer[i]+" ");
			System.out.println();
			message = String.copyValueOf(buffer, 0, idx - 2);
			// (idx-2)-> buffer에서 두글자빼고 출력하겠다
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if (isr != null)
					isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return message;
	}
 
	
	public void println(String msg) {
	  OutputStreamWriter osw= new OutputStreamWriter(System.out);
	  try {
		osw.write(msg);
		Thread.sleep(5000);
		osw.flush();
	} catch (IOException e) {
		
		e.printStackTrace();
	} catch (InterruptedException e) {
		e.printStackTrace();
	} finally {
		try {
			if(osw != null)osw.close();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	  
	}
}
