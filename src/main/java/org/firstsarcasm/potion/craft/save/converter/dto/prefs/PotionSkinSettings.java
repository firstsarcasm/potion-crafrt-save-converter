package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import lombok.Data;

public @Data class PotionSkinSettings{
	private String currentDescription;
	private boolean isCurrentIconColor4Custom;
	private boolean isCurrentIconCustom;
	private boolean isCurrentIconColor3Custom;
	private int colorsCount;
	private String currentIconName;
	private boolean isCurrentIconColor1Custom;
	private CurrentIconColor4 currentIconColor4;
	private String currentCustomTitle;
	private CurrentIconColor3 currentIconColor3;
	private boolean isCurrentIconColor2Custom;
	private int currentStickerAngle;
	private CurrentIconColor2 currentIconColor2;
	private CurrentIconColor1 currentIconColor1;
	private boolean isCurrentTitleCustom;
	private String currentBottleName;
	private String currentStickerName;
	private String currentRecipeNotes;
}