package base.externals.test;

import base.externals.BlankDisc;
import base.externals.ExtConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by huangbingjing on 18/6/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= ExtConfig.class)
public class ExternalsTest {

	@Autowired
//	@Qualifier("disc")
//	@Qualifier("disc2")
	private BlankDisc disc;

	@Autowired
	private Environment env;

	@Test
	public void injectFromProperties(){
		disc.show();
	}

	@Test
	public void asClassTest(){
		Class <BlankDisc> cdClass = env.getPropertyAsClass("disc.class", BlankDisc.class);
	}
}
