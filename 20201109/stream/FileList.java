package stream;

import java.io.File;

public class FileList {

	public static void main(String[] args) {
		File file = new File("c:\\");
		File[] list = file.listFiles();
		for (File f : list) {
			String str = f.getName() + "\t";
			if (f.isDirectory())
				str += "<DIR>";// 폴더
			else
				str += f.length() + "byte";// 파일
			System.out.println(str);
			// c드라이브에 있는 모든 파일명을 가지고온다(폴더명도 나옴)

		}

	}

}
