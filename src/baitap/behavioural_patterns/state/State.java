package baitap.behavioural_patterns.state;

public interface State {
	void play(MediaPlayer player);
	void pause(MediaPlayer player);
}