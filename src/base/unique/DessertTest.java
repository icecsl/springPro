package base.unique;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by huangbingjing on 18/6/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DessertConfig.class)
public class DessertTest {

	@Autowired
	@Qualifier("cold")
	private Dessert dessert;

	@Test
	public void test(){
		dessert.show();
	}
}
