package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import lombok.Data;

public @Data class ExperienceBonusMapItemsItem{
	private Boolean isDaily;
	private LocalPosition localPosition;
	private Boolean alreadyCollected;
}