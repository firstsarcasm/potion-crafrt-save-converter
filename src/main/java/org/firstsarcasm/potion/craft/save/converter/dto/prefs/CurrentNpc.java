package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import lombok.Data;

public @Data class CurrentNpc{
	private Npc npc;
	private int gold;
	private boolean isHaggleCanceled;
	private int mood;
	private boolean isAnyDealHaggled;
	private int bargained;
	private boolean isCurrentDealHaggled;
	private boolean isPotionSold;
}