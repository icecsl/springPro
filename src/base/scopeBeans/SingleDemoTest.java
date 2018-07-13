package base.scopeBeans;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huangbingjing on 18/6/7.
 */
public class SingleDemoTest {

	//spring 单例 单个容器中singleDemo只有一个
	@Test
	public void test(){

		ApplicationContext context = new ClassPathXmlApplicationContext("xml/base/singleDemo.xml");
		SingleDemo demo = (SingleDemo) context.getBean("singleDemo");
		demo.display();

		SingleDemo demo2 = (SingleDemo) context.getBean("singleDemo");
		System.out.println(demo==demo2);
	}

	//spring单例 java单例 不同容器中,singleDemo是不一样的,但是他们在各自的容器里只有一个
	@Test
	public void test2(){
		ApplicationContext context1 = new ClassPathXmlApplicationContext("xml/base/singleDemo.xml");
		SingleDemo context1demo1 = (SingleDemo) context1.getBean("singleDemo");
		SingleDemo context1demo2 = (SingleDemo) context1.getBean("singleDemo");
		System.out.println("context1中的两个demo比较:  " + (context1demo1==context1demo2));

		ApplicationContext context2 = new ClassPathXmlApplicationContext("xml/base/classpathxml.xml");
		SingleDemo context2demo1 = (SingleDemo) context2.getBean("singleDemo");
		SingleDemo context2demo2 = (SingleDemo) context2.getBean("singleDemo");
		System.out.println("context2中的两个demo比较:  " + (context2demo1==context2demo2));

		System.out.println("两个容器中的demo比较:  " + (context1demo1==context2demo1));

	}
}
