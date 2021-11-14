package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import lombok.Data;

public @Data class RecipeMarksItem{
	private Note note;
	private String stringValue;
	private double floatValue;
	private int type;
}