package base.stereoXmlconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试依赖spring-test包
 * Created by huangbingjing on 18/5/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:xml/base/stereoXml.xml")
public class CDXmlTest {

	@Autowired
	@Qualifier("cdPlayer1")
	private MediaPlayer player;

	@Test
	public void xmlIdTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext("xml/base/stereoXml.xml");
		CompactDisc disc = (CompactDisc)context.getBean("sgtPeppers");
		disc.play();
	}

	@Test
	public void xmlDITest(){
		player.play();
	}

}
