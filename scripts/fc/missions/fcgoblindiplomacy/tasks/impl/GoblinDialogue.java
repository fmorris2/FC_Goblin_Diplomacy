package scripts.fc.missions.fcgoblindiplomacy.tasks.impl;

import org.tribot.api.General;
import org.tribot.api.interfaces.Positionable;
import org.tribot.api2007.Player;
import org.tribot.api2007.types.RSArea;
import org.tribot.api2007.types.RSTile;

import scripts.fc.api.interaction.impl.npcs.dialogue.NpcDialogue;
import scripts.fc.api.travel.Travel;
import scripts.fc.framework.task.ItemsRequiredTask;
import scripts.fc.framework.task.Task;

public abstract class GoblinDialogue extends Task implements ItemsRequiredTask
{
	private static final long serialVersionUID = 5011148750621530569L;
	
	private static final Positionable GOBLIN_TILE = new RSTile(2957, 3512, 0);
	private static final RSArea GOBLIN_AREA = new RSArea(GOBLIN_TILE, 10);
	private static final String NPC_NAME = General.random(0, 1) == 0 ? "General Bentnoze" : "General Wartface";

	@Override
	public boolean execute()
	{
		if(!GOBLIN_AREA.contains(Player.getPosition()))
			Travel.webWalkTo(GOBLIN_TILE);
		else
			return new NpcDialogue("Talk-to", NPC_NAME, 15, 2, 2).execute();
		
		return false;
	}
}
