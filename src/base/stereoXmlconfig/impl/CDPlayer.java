package base.stereoXmlconfig.impl;


import base.stereoXmlconfig.CompactDisc;
import base.stereoXmlconfig.MediaPlayer;
import org.springframework.stereotype.Component;

/**
 * Created by huangbingjing on 18/5/31.
 */
@Component
public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;

	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	@Override
	public void play() {
		cd.play();
	}


}