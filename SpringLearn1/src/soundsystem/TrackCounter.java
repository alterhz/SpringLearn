package soundsystem;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackCounter {
	private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();
	
	private static int allocId = 0;
	private int id = 0;
	
	public TrackCounter() {
		this.id = ++allocId;
		System.out.println("create TrackCounter " + this.id);
	}
	
	public int getId() {
		return id;
	}

	@Pointcut("execution(* soundsystem.CompactDisc.playTrack(int)) && args(trackNumber)")
	public void trackPlayed(int trackNumber) {}
	
	@Before("trackPlayed(trackNumber)")
	public void countTrackBefore(int trackNumber) {
		int currentCount = getPlayCount(trackNumber);
		System.out.println("countTrackBefore trackNumber:" + trackNumber + "=" + currentCount);
		
		trackCounts.put(trackNumber, currentCount+1);
	}
	
	@After("trackPlayed(trackNumber)")
	public void countTrackAfter(int trackNumber) {
		int currentCount = getPlayCount(trackNumber);
		System.out.println("countTrackAfter trackNumber:" + trackNumber + "=" + currentCount);
	}
	
	public int getPlayCount(int trackNumber) {
		return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber) : 0;
	}
}
