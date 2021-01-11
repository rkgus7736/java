package Player;

public class Mp3Test {

	public static void main(String[] args) {
		//new로 선언해줘도 되지만 이 방식도 가능 ( c언어 방식)
		String[] list = {
		  "Dynamite","Lovesick Girl","Don't touch me",
		  "잠이 오질 않네요","취기를 빌려","힘든건 사랑이 아니다"
		};
		Mp3Player mp3 = new Mp3Player(list);
		mp3.play();
		mp3.next();
		mp3.next();
		mp3.next();
		mp3.next();
		mp3.next();
		mp3.next();
		mp3.next();
	}

	}


