package base.Chapter_01.DI;

import base.Chapter_01.DI.impl.BraveKnight;
import base.Chapter_01.DI.impl.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by huangbingjing on 18/5/30.
 */
@Configuration
public class KnightConfig {

	@Bean
	public Knight knight(){
		return new BraveKnight(quest());
	}

	@Bean
	public Quest quest(){
		return new SlayDragonQuest();
	}
}
