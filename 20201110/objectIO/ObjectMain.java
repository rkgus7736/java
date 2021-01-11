package objectIO;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectMain {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			//스트림 초기화
			fis = new FileInputStream("person.dat");
			ois = new ObjectInputStream(fis);
			try {
				//읽기
				while (true) {
					Person p = (Person) ois.readObject();
					// 무슨 형식인지 모르니까 일단 object 형식으로 들어감.나중에 변환해줘야함
					// read는 파일 끝이 어딘지 알수있어야함.
					System.out.println(p.toString());
				}
			} catch (EOFException e) {
				System.out.println(e.getMessage());
			}
          //쓰기
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally { //close처리
			try {
				ois.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
