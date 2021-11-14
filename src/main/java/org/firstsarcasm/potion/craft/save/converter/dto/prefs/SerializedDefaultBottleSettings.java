package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import lombok.Data;

public @Data class SerializedDefaultBottleSettings{
	private String defaultStickerStrongPotionName;
	private int defaultStickerAngleStrongPotion;
	private String defaultBottleNormalPotionName;
	private String defaultStickerWeakPotionName;
	private String defaultBottleWeakPotionName;
	private int defaultStickerAngleNormalPotion;
	private int defaultStickerAngleWeakPotion;
	private String defaultStickerNormalPotionName;
	private String defaultBottleStrongPotionName;
}