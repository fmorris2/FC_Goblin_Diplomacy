package scripts.fc.missions.fcgoblindiplomacy.data;

import java.util.List;

import scripts.fc.framework.mission.Mission;
import scripts.fc.framework.requirement.item.ItemRequirement;
import scripts.fc.framework.requirement.item.ReqItem;
import scripts.fc.framework.requirement.item.SingleReqItem;
import scripts.fc.framework.script.FCMissionScript;

public class GoblinDiplomacyRequirements extends ItemRequirement
{
	public static final int GOBLIN_MAIL = 288, BLUE_DYE = 1767, ORANGE_DYE = 1769,
			BLUE_MAIL = 287, ORANGE_MAIL = 286;
	
	public GoblinDiplomacyRequirements(FCMissionScript script)
	{
		super(script);
	}

	@Override
	public ReqItem[] getReqItems()
	{
		return new ReqItem[]
		{
			//BLUE GOBLIN MAIL
			new SingleReqItem(GOBLIN_MAIL, 1, true, true)
			.and(new SingleReqItem(BLUE_DYE, 1, true, true))
			.or(new SingleReqItem(BLUE_MAIL, 1, false, false)),
			
			//ORANGE MAIL
			new SingleReqItem(GOBLIN_MAIL, 1, true, true)
			.and(new SingleReqItem(ORANGE_DYE, 1, true, true))
			.or(new SingleReqItem(ORANGE_MAIL, 1, false, false)),
			
			//NORMAL MAIL
			new SingleReqItem(GOBLIN_MAIL, 1, true, true)
		};
	}

	@Override
	public List<Mission> getReqMissions()
	{
		return null;
	}

}
