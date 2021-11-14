package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import java.util.List;
import lombok.Data;

public @Data class CurrentBonusesItem{
	private String bonusObjectName;
	private int sizeIndex;
	private double size;
	private boolean isThereCustomPositions;
	private List<Object> customPositions;
	private double position;
}