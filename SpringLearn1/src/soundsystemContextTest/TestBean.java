package soundsystemContextTest;

import org.springframework.beans.factory.annotation.Autowired;


public class TestBean {

	@Autowired
	public CompactDisc cd;
	
	@Autowired
	public TrackCounter counter;
	
	public void test() {
		cd.playTrack(1);
		cd.playTrack(2);
		cd.playTrack(3);
		cd.playTrack(3);
		cd.playTrack(3);
		cd.playTrack(3);
		cd.playTrack(7);
		cd.playTrack(7);

		for (int i=1; i<=7; ++i) {
			int count = counter.getPlayCount(i);
			System.out.println(i + " : " + count);
		}
	}
}
