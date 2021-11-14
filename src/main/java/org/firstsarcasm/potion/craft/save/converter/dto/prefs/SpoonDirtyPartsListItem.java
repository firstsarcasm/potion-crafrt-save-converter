package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import lombok.Data;

public @Data class SpoonDirtyPartsListItem{
	private MaskLocalPosition maskLocalPosition;
	private double contaminationValue;
	private PartColor partColor;
}