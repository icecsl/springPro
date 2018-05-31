package base.stereoJavaconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * 测试依赖spring-test包
 * Created by huangbingjing on 18/5/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= CDConfig.class)
public class CDConfigTest {

	@Autowired
	@Qualifier("cdPlayer2")
	private MediaPlayer cdPlayer2;

	@Autowired
	@Qualifier("cdPlayer")
	private MediaPlayer cdPlayer;

	@Test
	public void test(){
		assertNotNull(cdPlayer);
		cdPlayer.play();
		System.out.println(cdPlayer == cdPlayer2);
	}


}
