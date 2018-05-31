package base.stereoAutoconfig.test;

import base.stereoAutoconfig.CompactDisc;
import base.stereoAutoconfig.impl.SgtPeppers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;


/**
 * 测试依赖spring-test包
 * Created by huangbingjing on 18/5/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:xml/base/soundsystem.xml")
public class CDXMLConfigTest {

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
      assertNotNull(cd);
    }

    @Test
    public void play() {
      cd.play();
    }


    /*
    ** 采用最原始的读取配置方法, 这种情况下不需要CDPlayerXMLConfigTest上面的两个注解
    */
    @Test
    public void  test(){
      ApplicationContext context = new ClassPathXmlApplicationContext("xml/base/soundsystem.xml");
      CompactDisc compactDisc = (SgtPeppers) context.getBean("sgtPeppers");
      compactDisc.play();
    }

}
