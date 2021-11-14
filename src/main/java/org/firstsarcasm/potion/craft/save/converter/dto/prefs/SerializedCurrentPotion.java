package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import java.util.List;
import lombok.Data;

public @Data class SerializedCurrentPotion{
	private List<RecipeMarksItem> recipeMarks;
	private List<Object> collectedPotionEffects;
	private List<Object> potionUsedComponents;
	private SerializedPath serializedPath;
	private PotionSkinSettings potionSkinSettings;
}