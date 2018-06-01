package base.stereoMixedconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({CDPlayerConfig.class, CDConfig.class})
@ImportResource("classpath:cd-config.xml")
public class SoundSystemConfig {

}
