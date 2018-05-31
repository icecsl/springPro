package base.stereoXmlconfig.impl;

import base.stereoXmlconfig.MediaPlayer;
import base.stereoXmlconfig.CompactDisc;

/**
 * Created by huangbingjing on 18/5/31.
 */
public class CDPlayerNoCtor implements MediaPlayer{


	private CompactDisc cd;

	@Override
	public void play() {
		cd.play();
	}

	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}
}
