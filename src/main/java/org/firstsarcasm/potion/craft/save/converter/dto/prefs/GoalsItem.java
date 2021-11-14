package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import lombok.Data;

public @Data class GoalsItem{
	private int followState;
	private String name;
	private int progress;
	private Boolean isCompletionRead;
}