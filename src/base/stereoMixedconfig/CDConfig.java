package base.stereoMixedconfig;

import base.stereoMixedconfig.impl.SgtPeppers;
import base.stereoXmlconfig.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {
  @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
}