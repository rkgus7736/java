package Player;

/*
 * 생성자에서는 생성된 Player(Cdp,Mp3)를 받아옴
 * ChangePlay(Player p)-새 플레이어를 받아옴
 * UsePlayer() -플레이어를 제어
 */

public class User {
	private Player player;

	public User(Player player) {
		this.player = player;
	}

	public void changePlayer(Player player) {
		this.player = player;

	}

	public void playPlayer() {
		player.play();
	}

	public void stopPlayer() {
		player.stop();
	}

	public void nextPlayer() {
		player.next();
	}

	public void prevPlayer() {
		player.prev();
	}
}
