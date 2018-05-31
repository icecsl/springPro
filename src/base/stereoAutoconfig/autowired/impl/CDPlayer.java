package base.stereoAutoconfig.autowired.impl;

import base.stereoAutoconfig.CompactDisc;
import base.stereoAutoconfig.autowired.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by huangbingjing on 18/5/31.
 */
@Component
public class CDPlayer implements MediaPlayer{

	private CompactDisc cd;

	/* 1. 构造器上添加@Autowired */
	/*@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}*/

	@Override
	public void play() {
		cd.play();
	}

	/* 3. 任何方法上添加@Autowired */
	@Autowired(required = false)
	public void insertCD(CompactDisc cd){
		this.cd = cd;
	}

	/* 2. setter上添加@Autowired */
	/*@Autowired
	public void setCd(CompactDisc cd) {
		this.cd = cd;
	}*/
}
