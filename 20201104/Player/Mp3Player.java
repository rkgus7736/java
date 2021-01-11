package Player;

import java.util.List;

public class Mp3Player extends Player {
	private String[] list;// 곡 목록
	private int index;// 현재 저장된 곡 리스트 번호

	public Mp3Player(String[] list) {
		this.list = list;
		index = 0;
	}

	@Override
	public void play() {
		System.out.println(list[index] + "곡 재생");
	}

	@Override
	public void pause() {
		System.out.println(list[index] + "곡 정지");
	}

	@Override
	public void next() {
		// index : 0~list.length-1
		index++;
		if (index >= list.length)
			index = 0;
		play();

	}

	@Override
	public void prev() {
		index--;
		if (index < 0)
			index = list.length - 1;
		play();

	}

}
