package scripts.fc.missions.fcgoblindiplomacy.tasks.impl;

import scripts.fc.api.items.FCItem;
import scripts.fc.framework.task.ItemsRequiredTask;
import scripts.fc.framework.task.Task;
import scripts.fc.missions.fcgoblindiplomacy.data.GoblinDiplomacyRequirements;
import scripts.fc.missions.fcgoblindiplomacy.data.GoblinDiplomacySettings;

public class WithdrawItems extends Task implements ItemsRequiredTask
{
	private static final long serialVersionUID = -5672187344461409481L;

	@Override
	public FCItem[] getRequiredItems()
	{
		return new FCItem[]
		{
			new FCItem(3, false, GoblinDiplomacyRequirements.GOBLIN_MAIL),
			new FCItem(1, false, GoblinDiplomacyRequirements.BLUE_DYE),
			new FCItem(1, false, GoblinDiplomacyRequirements.ORANGE_DYE)
		};
	}

	@Override
	public boolean execute()
	{
		return false;
	}

	@Override
	public boolean shouldExecute()
	{
		return GoblinDiplomacySettings.WITHDRAW_ITEMS.isValid();
	}

	@Override
	public String getStatus()
	{
		return "Withdraw items";
	}

}
