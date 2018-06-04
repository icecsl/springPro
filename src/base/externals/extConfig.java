package base.externals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by huangbingjing on 18/6/4.
 */
@Configuration
@PropertySource("classpath:base/externals/app.properties")
public class ExtConfig {

	@Autowired
	Environment env;

	@Bean
	public BlankDisc disc(){
		return new BlankDisc(
				env.getProperty("disc.title"),
				env.getProperty("disc.artist"));
	}
}
