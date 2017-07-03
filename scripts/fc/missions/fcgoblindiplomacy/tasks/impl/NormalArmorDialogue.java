package scripts.fc.missions.fcgoblindiplomacy.tasks.impl;

import scripts.fc.api.items.FCItem;
import scripts.fc.missions.fcgoblindiplomacy.data.GoblinDiplomacyRequirements;
import scripts.fc.missions.fcgoblindiplomacy.data.GoblinDiplomacySettings;

public class NormalArmorDialogue extends GoblinDialogue
{
	private static final long serialVersionUID = -520517646388252429L;

	@Override
	public FCItem[] getRequiredItems()
	{
		return new FCItem[]
		{
			new FCItem(1, false, GoblinDiplomacyRequirements.GOBLIN_MAIL)
		};
	}

	@Override
	public boolean shouldExecute()
	{
		return GoblinDiplomacySettings.TURN_IN_NORMAL_ARMOR.isValid();
	}

	@Override
	public String getStatus()
	{
		return "Turn in normal armor";
	}

}
