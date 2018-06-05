package base.classpathxml;

import base.externals.BlankDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by huangbingjing on 18/6/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:xml/base/classpathxml.xml")
public class ClassPathXmlTest {

	@Autowired
	private BlankDisc blankDisc;

	@Test
	public void test(){
		blankDisc.show();
	}

}
