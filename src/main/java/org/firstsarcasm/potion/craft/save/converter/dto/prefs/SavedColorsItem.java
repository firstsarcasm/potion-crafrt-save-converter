package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import lombok.Data;

public @Data class SavedColorsItem{
	private Color color;
	private Hsv hsv;
	private boolean isDefaultColor;
}