package base.stereoAutoconfig.impl;

import base.stereoAutoconfig.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * Created by huangbingjing on 18/5/30.
 */
/* @Component 表明该类作为组件类,告知Spring为这个类创建bean*/
@Component
public class SgtPeppers implements CompactDisc {

	@Override
	public void play() {
		System.out.println("Playing Sgt. Pepper's Lonely Hearts Club Band  by The Beatles");
	}
}
