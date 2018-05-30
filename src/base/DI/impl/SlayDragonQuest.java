package base.DI.impl;


import base.DI.Quest;

/**
 * Created by huangbingjing on 18/5/24.
 */
public class SlayDragonQuest implements Quest {
	@Override
	public void embark() {
		System.out.println("SlayDragonQuest.embark()");
	}
}
