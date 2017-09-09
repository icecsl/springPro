package test;


import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
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

	//加载classpath下的文件 是src目录下
	@Test
	public void test2(){

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml/applicationContext.xml");
		HelloWorldService helloWorldService = (HelloWorldService)applicationContext.getBean("helloService");
		helloWorldService.sayHello();
	}


	//加载磁盘文件,项目目录下
	@Test
	public void test3(){

		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext1.xml");
		HelloWorldService helloWorldService = (HelloWorldService)applicationContext.getBean("helloService");
		helloWorldService.sayHello();
	}

	//beanfactory  和test2相似,加载classpath下的文件,不常用了
	@Test
	public void test4(){

		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("xml/applicationContext.xml"));
		HelloWorldService helloWorldService = (HelloWorldService)beanFactory.getBean("helloService");
		helloWorldService.sayHello();
	}

	//beanfactory  和test3相似,加载磁盘文件,不常用了
	@Test
	public void test5(){

		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("web/WEB-INF/applicationContext1.xml"));
		HelloWorldService helloWorldService = (HelloWorldService)beanFactory.getBean("helloService");
		helloWorldService.sayHello();
	}

}
