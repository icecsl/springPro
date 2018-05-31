package base.stereoXmlconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试依赖spring-test包
 * Created by huangbingjing on 18/5/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:xml/base/stereoXml.xml")
public class CDNoCtorXmlTest {

	@Autowired
	@Qualifier("cDPlayerNoCtor1")
	private MediaPlayer player;

	@Test
	public void xmlDITest(){
		player.play();
	}

}
