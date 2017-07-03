package scripts.fc.missions.fcgoblindiplomacy.tasks.impl;

import scripts.fc.api.items.FCItem;
import scripts.fc.missions.fcgoblindiplomacy.data.GoblinDiplomacyRequirements;
import scripts.fc.missions.fcgoblindiplomacy.data.GoblinDiplomacySettings;

public class BlueArmorDialogue extends GoblinDialogue
{
	private static final long serialVersionUID = -3731886152209305849L;

	@Override
	public FCItem[] getRequiredItems()
	{
		return new FCItem[]
		{
			new FCItem(1, false, GoblinDiplomacyRequirements.BLUE_MAIL)
		};
	}

	@Override
	public String getStatus()
	{
		return "Turn in blue armor";
	}

	@Override
	public boolean shouldExecute()
	{
		return GoblinDiplomacySettings.TURN_IN_BLUE_ARMOR.isValid();
	}

}
