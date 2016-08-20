package design_pattern.chapter9;

import java.util.List;

/**
 * Created by wayne on 2016. 6. 18..
 */
public class DataSheetView implements Observer{
	private ScoreRecord scoreRecord;
	private int viewCount;

	public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}

	// 점수 변경의 통보를 받는다
	@Override
	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord();
		displayScores(record, viewCount);
	}

	private void displayScores(List<Integer> record, int viewCount) {
		System.out.print("List of " + viewCount + " entries: ");
		for (int i = 0; i < viewCount && i < record.size(); i++) {
			System.out.print(record.get(i) + " ");
		}
		System.out.println();
	}
}
