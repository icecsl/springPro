package base.stereoJavaconfig;

import base.stereoJavaconfig.impl.CDPlayer;
import base.stereoJavaconfig.impl.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by huangbingjing on 18/5/30.
 */
@Configuration
public class CDConfig {
	@Bean
	public CompactDisc sgtPeppers(){
		return new SgtPeppers();
	}

	@Bean
	public CDPlayer cdPlayer() {
		return new CDPlayer(sgtPeppers());
	}

	@Bean
	public CDPlayer cdPlayer2(CompactDisc cd) {
		return new CDPlayer(cd);
	}

}
