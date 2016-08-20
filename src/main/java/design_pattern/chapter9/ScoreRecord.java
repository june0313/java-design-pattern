package design_pattern.chapter9;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wayne on 2016. 6. 18..
 */
public class ScoreRecord extends Subject{
	private List<Integer> scores = new ArrayList<>();

	public void addScore(int score) {
		scores.add(score);
		notifyObservers();
	}

	public List<Integer> getScoreRecord() {
		return scores;
	}
}
