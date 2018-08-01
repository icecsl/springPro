package base.aopDemo.test;

import base.aopDemo.Performance;
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
@ContextConfiguration(locations = "classpath:xml/base/aopDemo.xml")
public class AopDemoXmlTest {
	@Autowired
	private Performance performance;

	@Test
	public void performTest(){
		performance.perform();
	}
}
