package scripts.fc.missions.fcgoblindiplomacy.data;

import java.util.Arrays;

import scripts.fc.framework.quest.InvBankBool;
import scripts.fc.framework.quest.Order;
import scripts.fc.framework.quest.QuestState;
import scripts.fc.framework.quest.SettingBool;
import scripts.fc.missions.fcgoblindiplomacy.FCGoblinDiplomacy;

public enum GoblinDiplomacySettings
{
	DYE_BLUE_ARMOR
	(
		new QuestState
		(
			new SettingBool(FCGoblinDiplomacy.SETTING, 0, true, Order.EQUALS),
			new InvBankBool(GoblinDiplomacyRequirements.BLUE_MAIL, 1, false, false)
		)
	),
	
	DYE_ORANGE_ARMOR
	(
		new QuestState
		(
			new SettingBool(FCGoblinDiplomacy.SETTING, 0, true, Order.EQUALS),
			new InvBankBool(GoblinDiplomacyRequirements.ORANGE_MAIL, 1, false, false)
		)
	),
	
	START_QUEST
	(
		new QuestState
		(
			new SettingBool(FCGoblinDiplomacy.SETTING, 0, true, Order.EQUALS)
		)
	),
	
	TURN_IN_ORANGE_ARMOR
	(
		new QuestState
		(
			new SettingBool(FCGoblinDiplomacy.SETTING, 3, true, Order.EQUALS),
			new InvBankBool(GoblinDiplomacyRequirements.ORANGE_MAIL, 1, false, true)
		)
	),
	
	TURN_IN_BLUE_ARMOR
	(
		new QuestState
		(
			new SettingBool(FCGoblinDiplomacy.SETTING, 4, true, Order.EQUALS),
			new InvBankBool(GoblinDiplomacyRequirements.BLUE_MAIL, 1, false, true)
		)
	),
	
	TURN_IN_NORMAL_ARMOR
	(
		new QuestState
		(
			new SettingBool(FCGoblinDiplomacy.SETTING, 5, true, Order.EQUALS),
			new InvBankBool(GoblinDiplomacyRequirements.GOBLIN_MAIL, 1, false, true)
		)
	),
	
	QUEST_COMPLETE
	(
		new QuestState
		(
			new SettingBool(FCGoblinDiplomacy.SETTING, 6, true, Order.EQUALS)
		)
	);
	
	private QuestState[] states;
	
	GoblinDiplomacySettings(QuestState... states)
	{
		this.states = states;
	}
	
	public boolean isValid()
	{
		return Arrays.stream(states).allMatch(s -> s.validate());
	}
}
