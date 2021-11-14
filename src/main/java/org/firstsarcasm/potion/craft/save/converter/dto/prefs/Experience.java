package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import lombok.Data;

public @Data class Experience{
	private double nextLvlAt;
	private double currentExp;
	private int currentLvl;
	private double currentLvlAt;
}