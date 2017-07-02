package scripts.fc.missions.fcgoblindiplomacy.tasks.impl;

import org.tribot.api2007.Inventory;

import scripts.fc.api.interaction.impl.items.ItemOnItem;
import scripts.fc.api.items.FCItem;
import scripts.fc.api.wrappers.FCTiming;
import scripts.fc.framework.task.ItemsRequiredTask;
import scripts.fc.framework.task.Task;
import scripts.fc.missions.fcgoblindiplomacy.data.GoblinDiplomacyRequirements;
import scripts.fc.missions.fcgoblindiplomacy.data.GoblinDiplomacySettings;

public class DyeOrangeArmor extends Task implements ItemsRequiredTask
{
	private static final long serialVersionUID = -7562252696763388405L;

	@Override
	public boolean execute()
	{
		return new ItemOnItem("Use", "Orange dye", "Goblin mail").execute() 
				&& FCTiming.waitCondition(() -> Inventory.getCount(GoblinDiplomacyRequirements.ORANGE_MAIL) > 0, 1200);
	}

	@Override
	public boolean shouldExecute()
	{
		return GoblinDiplomacySettings.DYE_ORANGE_ARMOR.isValid();
	}

	@Override
	public String getStatus()
	{
		return "Dye Orange Armor";
	}
	

	@Override
	public FCItem[] getRequiredItems()
	{
		return new FCItem[]
		{
			new FCItem(1, false, GoblinDiplomacyRequirements.GOBLIN_MAIL),
			new FCItem(1, false, GoblinDiplomacyRequirements.ORANGE_DYE)
		};
	}

}
