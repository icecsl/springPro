package test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.HelloWorldService;
import service.impl.HelloWorldServiceImpl;


/**
 * Created by huangbingjing on 17/8/24.
 */
public class HelloServiceTest {

	@Test
	public void test(){

		HelloWorldService helloWorldService = new HelloWorldServiceImpl();
		helloWorldService.sayHello();
	}

	@Test
	public void test2(){

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml/applicationContext.xml");
		HelloWorldService helloWorldService = (HelloWorldService)applicationContext.getBean("helloService");
		helloWorldService.sayHello();
	}


}
