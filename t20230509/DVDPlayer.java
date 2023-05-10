package t20230509;

public class DVDPlayer implements Explayer{
	
	public void play() {
		System.out.println("DVD 재생 시작!");
	}

	@Override
	public void stop() {
		System.out.println("DVD 재생 종료!");
	}

	@Override
	public void slow() {
		System.out.println("DVD 느린 재생 시작!");
	}
}
