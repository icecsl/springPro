package base.aopParam;

import base.aopParam.impl.BlankDiscImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: huangbingjing
 * @date: 18/7/31
 */
@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

	@Bean
	public CompactDisc sgtPeppers(){
		BlankDiscImpl blankDisc = new BlankDiscImpl();
		blankDisc.setTitle("sgtPeppers Lonely Hearts Club Band");

		List<String> tracks = new ArrayList<>();
		tracks.add("song 0");
		tracks.add("song 1");
		tracks.add("song 2");
		tracks.add("song 3");
		tracks.add("song 4");
		tracks.add("song 5");
		blankDisc.setTracks(tracks);

		return blankDisc;

	}

	@Bean
	public TrackCounter trackCounter(){
		return new TrackCounter();
	}
}
