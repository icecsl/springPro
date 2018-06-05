package base.externals;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by huangbingjing on 18/6/4.
 */
@Configuration
@PropertySource("classpath:base/externals/app.properties")
@ComponentScan
public class ExtConfig {

//	@Autowired
//	Environment env;
//
//	@Bean
//	public BlankDisc disc(){
//		return new BlankDisc(
//				env.getProperty("disc.title","default value"),
//				env.getProperty("disc.artist"), env.getProperty("disc.age", Integer.class, 30));
//	}
//
//	@Bean
//	public BlankDisc disc2(){
//		return new BlankDisc(
//				env.getRequiredProperty("disc.title"),
//				env.getRequiredProperty("disc.artist"),
//				env.getRequiredProperty("disc.age", Integer.class));
//	}

}
