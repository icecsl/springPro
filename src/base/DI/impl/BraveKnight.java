package base.DI.impl;


import base.DI.Knight;
import base.DI.Quest;

/**
 * Created by huangbingjing on 18/5/24.
 */
public class BraveKnight implements Knight {

	private Quest quest;

	public BraveKnight(Quest quest){
		this.quest=quest;
	}
	@Override
	public void embarkOnQuest() {
		quest.embark();
	}
}
