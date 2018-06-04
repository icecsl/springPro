package base.externals.test;

import base.externals.BlankDisc;
import base.externals.ExtConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by huangbingjing on 18/6/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= ExtConfig.class)
public class ExternalsTest {

	@Autowired
	private BlankDisc blankDisc;

	@Test
	public void injectFromProperties(){
		blankDisc.show();
	}
}
