package scripts.fc.missions.fcgoblindiplomacy.tasks.impl;

import scripts.fc.api.items.FCItem;
import scripts.fc.missions.fcgoblindiplomacy.data.GoblinDiplomacyRequirements;
import scripts.fc.missions.fcgoblindiplomacy.data.GoblinDiplomacySettings;

public class OrangeArmorDialogue extends GoblinDialogue
{
	private static final long serialVersionUID = -1466430372868691990L;

	@Override
	public FCItem[] getRequiredItems()
	{
		return new FCItem[]
		{
			new FCItem(1, false, GoblinDiplomacyRequirements.ORANGE_MAIL)
		};
	}

	@Override
	public boolean shouldExecute()
	{
		return GoblinDiplomacySettings.TURN_IN_ORANGE_ARMOR.isValid();
	}

	@Override
	public String getStatus()
	{
		return "Turn in orange armor";
	}

}
