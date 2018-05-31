package base.stereoAutoconfig.autowired.test;

import base.stereoAutoconfig.CDConfig;
import base.stereoAutoconfig.autowired.MediaPlayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by huangbingjing on 18/5/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDConfig.class)
public class CDPlayerTest {
	@Autowired
	private MediaPlayer mediaPlayer;

	@Test
	public void playTest(){
		mediaPlayer.play();
	}
}
