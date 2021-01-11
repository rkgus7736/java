package Player;

public class CdPlayer extends Player {
	//전체 트랙 개수
	private int track;
	private int currentTrack;

	public CdPlayer(int track) {
		this.track = track;
	}

	@Override
	public void play() {
		System.out.println("Track "+currentTrack+" Play");
	}

	
	@Override
	public void pause() {
		System.out.println("Play Stop");
	}

	@Override
	public void next() {
		currentTrack++;
		if(currentTrack > track)
			currentTrack = 0;
		play();
	}

	@Override
	public void prev() {
		currentTrack--;
		if(currentTrack < 0)
			currentTrack = track;
		play();
	}
	
	
	
}



