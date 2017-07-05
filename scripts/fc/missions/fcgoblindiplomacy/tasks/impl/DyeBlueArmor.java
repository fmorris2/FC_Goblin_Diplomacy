package scripts.fc.missions.fcgoblindiplomacy.tasks.impl;

import org.tribot.api2007.Banking;
import org.tribot.api2007.Inventory;

import scripts.fc.api.interaction.impl.items.ItemOnItem;
import scripts.fc.api.items.FCItem;
import scripts.fc.api.wrappers.FCTiming;
import scripts.fc.framework.task.ItemsRequiredTask;
import scripts.fc.framework.task.Task;
import scripts.fc.missions.fcgoblindiplomacy.data.GoblinDiplomacyRequirements;
import scripts.fc.missions.fcgoblindiplomacy.data.GoblinDiplomacySettings;

public class DyeBlueArmor extends Task implements ItemsRequiredTask
{
	private static final long serialVersionUID = 5998591333441257911L;

	@Override
	public boolean execute()
	{
		if(Banking.isBankScreenOpen())
			return Banking.close();
		
		return new ItemOnItem("Use", "Blue dye", "Goblin mail").execute() 
				&& FCTiming.waitCondition(() -> Inventory.getCount(GoblinDiplomacyRequirements.BLUE_MAIL) > 0, 1200);
	}

	@Override
	public boolean shouldExecute()
	{
		return GoblinDiplomacySettings.DYE_BLUE_ARMOR.isValid();
	}

	@Override
	public String getStatus()
	{
		return "Dye Blue Armor";
	}

	@Override
	public FCItem[] getRequiredItems()
	{
		return new FCItem[]
		{
			new FCItem(1, false, GoblinDiplomacyRequirements.BLUE_DYE),
			new FCItem(1, false, GoblinDiplomacyRequirements.GOBLIN_MAIL)
		};
	}

}
