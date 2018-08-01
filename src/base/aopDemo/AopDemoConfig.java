package base.aopDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description:
 * @author: huangbingjing
 * @date: 18/7/31
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AopDemoConfig {
	@Bean
	public Audience audience(){
		return new Audience();
	}
}
