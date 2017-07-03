package scripts.fc.missions.fcgoblindiplomacy;

import java.util.Arrays;
import java.util.LinkedList;

import scripts.fc.framework.quest.QuestScriptManager;
import scripts.fc.framework.requirement.Requirement;
import scripts.fc.framework.script.FCMissionScript;
import scripts.fc.framework.task.Task;
import scripts.fc.missions.fcgoblindiplomacy.data.GoblinDiplomacyRequirements;
import scripts.fc.missions.fcgoblindiplomacy.tasks.impl.BlueArmorDialogue;
import scripts.fc.missions.fcgoblindiplomacy.tasks.impl.DyeBlueArmor;
import scripts.fc.missions.fcgoblindiplomacy.tasks.impl.DyeOrangeArmor;
import scripts.fc.missions.fcgoblindiplomacy.tasks.impl.NormalArmorDialogue;
import scripts.fc.missions.fcgoblindiplomacy.tasks.impl.OrangeArmorDialogue;
import scripts.fc.missions.fcgoblindiplomacy.tasks.impl.StartQuest;

public class FCGoblinDiplomacy extends QuestScriptManager
{
	public static final int SETTING = 62;
	
	public FCGoblinDiplomacy(FCMissionScript fcScript)
	{
		super(fcScript);
	}

	@Override
	public boolean hasReachedEndingCondition()
	{
		return false;
	}

	@Override
	public String getMissionName()
	{
		return "FC Goblin Diplomacy";
	}

	@Override
	public String getEndingMessage()
	{
		return "Thank you for running FC Goblin Diplomacy!";
	}

	@Override
	public String[] getMissionSpecificPaint()
	{
		return new String[]{};
	}

	@Override
	public void resetStatistics()
	{
	}

	@Override
	public Requirement[] getRequirements()
	{
		return new Requirement[]{new GoblinDiplomacyRequirements(missionScript)};
	}

	@Override
	public LinkedList<Task> getTaskList()
	{
		return new LinkedList<>(Arrays.asList(new DyeBlueArmor(), new DyeOrangeArmor(), 
				new BlueArmorDialogue(), new StartQuest(), new OrangeArmorDialogue(), new NormalArmorDialogue()));
	}
	
	public String toString()
	{
		return "Goblin Diplomacy";
	}

}
