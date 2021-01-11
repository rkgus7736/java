package Player;

public class UserMain {

	public static void main(String[] args) {
	    CdPlayer player = new CdPlayer(7);
		String[] list = {
		  "Dynamite","Lovesick Girl","Don't touch me",
		  "잠이 오질 않네요","취기를 빌려","힘든건 사랑이 아니다"
		};
		Mp3Player mp3 = new Mp3Player(list);
		
		User user = new User(mp3);
		//새롭게 만들어주지 않아도 그때그때 추가하면 되는 부분.
		//실제로 게임에서 아이템 장착에 많이 사용
		//상속만 받아서 리소스만 추가
		//코드를 새로 만들지않고 그때마다 수정해가면서 사용가능
		user.playPlayer();
		user.nextPlayer();
		user.nextPlayer();
		user.nextPlayer();
		user.changePlayer(player);
		user.nextPlayer();
		user.nextPlayer();
		user.nextPlayer();
		user.nextPlayer();
		user.nextPlayer();
	}

	



	}


