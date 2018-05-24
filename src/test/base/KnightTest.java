package test.base;

import base.DI.Knight;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huangbingjing on 18/5/24.
 */
public class KnightTest {

	@Test
	public void knightTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext("xml/knight.xml");
		Knight knight = (Knight) context.getBean("knight");
		knight.embarkOnQuest();

//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xml/applicationContext.xml");
//		HelloWorldService helloWorldService = (HelloWorldService)applicationContext.getBean("helloService");
//		helloWorldService.sayHello();
	}

	/*public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("xml/knight.xml");
		Knight knight = (Knight) context.getBean("knight");
		knight.embarkOnQuest();
	}*/
}
