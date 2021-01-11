package stream;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("c:\\20201109\\test.txt");
		// 로컬 디스크 c에 들어왔을때.
		// 역슬러쉬 1번 쓰면 인식 불가함 2번 써줘야함.
		// 생성을 하지않고 파일 경로만 잡아주는것이라 폴더나 파일없어도 가능
		// "c:\\20201109\\test.txt" (c:\\저장될 위치,\\폴더,\\파일)

		// 해당 경로가 있나?
		System.out.println(file.exists());
		System.out.println(file.getParent());
		// getParent 는 자식 test.txt가 들어가있는 부모폴더를 의미
		File pDir = file.getParentFile();
		System.out.println(pDir);
		if (!pDir.exists())
			pDir.mkdirs();// 해당 경로까지 폴더를 전부 생성

		// 해당 파일이 없으면,파일생성(폴더는 만들지 못함.if(!를 무조건 해줘야함.)
		if (!file.exists()) {
			// 파일 생성(해당하는 경로까지 미리 만들기)
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("파일크기:" + file.length() + "byte");
		System.out.println("해당 경로는 폴더?" + file.isDirectory());
		System.out.println("해당 경로는 파일?" + file.isFile());
		System.out.println(file.getPath());// 현재 파일 경로 -> 초기화 값
		System.out.println(file.getAbsolutePath());// 절대 경로(많이쓰게될것)
		file.renameTo(new File("c:\\20201109\\txt"));// 파일 이름 변경
		file.delete();// 파일 삭제

	}

}
