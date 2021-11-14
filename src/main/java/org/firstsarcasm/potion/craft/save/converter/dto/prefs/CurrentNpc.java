package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import lombok.Data;

public @Data class CurrentNpc{
	private Npc npc;
	private int gold;
	private Boolean isHaggleCanceled;
	private int mood;
	private Boolean isAnyDealHaggled;
	private int bargained;
	private Boolean isCurrentDealHaggled;
	private Boolean isPotionSold;
}