package soundsystem4_4_3;

import java.util.HashMap;
import java.util.Map;

public class TrackCounter {
	private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();
	
	public void countTrack(int trackNumber) {
		int currentCount = getPlayCount(trackNumber);
		trackCounts.put(trackNumber, currentCount+1);
	}
	
	public int getPlayCount(int trackNumber) {
		return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
	}
}
