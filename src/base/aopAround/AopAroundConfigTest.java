package base.aopAround;

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
@ContextConfiguration(classes = AopAroundConfig.class)
public class AopAroundConfigTest {

	@Autowired
	private PerformanceA performanceA;

	@Test
	public void performTest(){
		performanceA.perform();
	}
}
