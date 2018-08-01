package base.aopParam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description:
 * @author: huangbingjing
 * @date: 18/7/31
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TrackCounterConfig.class)
public class AopParamTest {
	@Autowired
	private CompactDisc compactDisc;
	@Autowired
	private TrackCounter trackCounter;

	@Test
	public void test(){
		compactDisc.playTrack(3);
		compactDisc.playTrack(3);
		compactDisc.playTrack(1);
		compactDisc.playTrack(1);
		compactDisc.playTrack(2);

		System.out.println(trackCounter.getPlayCount(1));
		System.out.println(trackCounter.getPlayCount(2));
		System.out.println(trackCounter.getPlayCount(3));
	}


}
