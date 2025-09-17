interface Media {
	void play();
	void stop();
	
	default void pause() {
		System.out.println("Media Paused");
	}
	
	static void about() {
		System.out.println("Thia is a media interface");
	}
}

interface AdvancedMedia extends Media {
	void nextTrack();
}

class MusicPlayer implements AdvancedMedia {
	public void play() {
		System.out.println("Play the music");
	}
	
	public void stop() {
		System.out.println("Stop playing the music");
	}
	
	public void nextTrack() {
		System.out.println("Play the next music");
	}
	
	public void pause() {
		System.out.println("Pause the music");
	}
}

public class InterfaceImplementation {
	public static void main(String[] args) {
		MusicPlayer spotify = new MusicPlayer();
		
		spotify.play();
		spotify.pause();
		spotify.nextTrack();
		spotify.stop();
		
		Media.about();
	}
}
