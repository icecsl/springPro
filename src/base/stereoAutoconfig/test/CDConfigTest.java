package base.stereoAutoconfig.test;

import base.stereoAutoconfig.CDConfig;
import base.stereoAutoconfig.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
	private CompactDisc compactDisc;

	@Test
	public void test(){
		assertNotNull(compactDisc);
		compactDisc.play();
	}


}
