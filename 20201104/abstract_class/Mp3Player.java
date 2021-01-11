package abstract_class;
//추상클래스 상속
public class Mp3Player extends Player {

	@Override
	public void play() {
		System.out.println("Mp3 Play");
		
	}

	@Override
	public void stop() {
		System.out.println("Mp3 Stop");
		
	}

	@Override
	public void next() {
		System.out.println("Mp3 Next Play");
		
	}

	@Override
	public void prev() {
		System.out.println("Mp3 Prev Play");
		
	}

}



