package base.aopDemo.test;

import base.aopDemo.AopDemoConfig;
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
@ContextConfiguration(classes = AopDemoConfig.class)
public class AopDemoConfigTest {

	@Autowired
	private Performance performance;

	@Test
	public void performTest(){
		performance.perform();
	}
}
