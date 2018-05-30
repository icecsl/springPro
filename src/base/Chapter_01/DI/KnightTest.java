package base.Chapter_01.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by huangbingjing on 18/5/24.
 */
public class KnightTest {

	public static void main(String[] args) {

		//读取xml装载bean 获取knight	-	构造器依赖注入
		ApplicationContext context = new ClassPathXmlApplicationContext("xml/base/knight.xml");
		Knight knight = (Knight) context.getBean("knight");
		knight.embarkOnQuest();
	}

}
