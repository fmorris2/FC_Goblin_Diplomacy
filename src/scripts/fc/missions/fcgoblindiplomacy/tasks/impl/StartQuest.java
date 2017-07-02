package scripts.fc.missions.fcgoblindiplomacy.tasks.impl;

import scripts.fc.api.items.FCItem;
import scripts.fc.missions.fcgoblindiplomacy.data.GoblinDiplomacyRequirements;
import scripts.fc.missions.fcgoblindiplomacy.data.GoblinDiplomacySettings;

public class StartQuest extends GoblinDialogue
{
	private static final long serialVersionUID = 3085921717186491966L;

	@Override
	public boolean shouldExecute()
	{
		return GoblinDiplomacySettings.START_QUEST.isValid();
	}

	@Override
	public String getStatus()
	{
		return "Start quest";
	}
	
	@Override
	public FCItem[] getRequiredItems()
	{
		return new FCItem[]
		{
			new FCItem(1, false, false, GoblinDiplomacyRequirements.BLUE_MAIL),
			new FCItem(1, false, false, GoblinDiplomacyRequirements.ORANGE_MAIL),
			new FCItem(1, false, false, GoblinDiplomacyRequirements.GOBLIN_MAIL)
		};
	}
}
