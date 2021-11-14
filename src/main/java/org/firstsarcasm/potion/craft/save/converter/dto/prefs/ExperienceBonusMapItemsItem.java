package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import lombok.Data;

public @Data class ExperienceBonusMapItemsItem{
	private boolean isDaily;
	private LocalPosition localPosition;
	private boolean alreadyCollected;
}