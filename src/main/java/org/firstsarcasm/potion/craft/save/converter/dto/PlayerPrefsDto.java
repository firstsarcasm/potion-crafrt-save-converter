package org.firstsarcasm.potion.craft.save.converter.dto;

import lombok.Data;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.ChaptersGroupsItem;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.ChunksItem;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.CoalsHeat;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.ColorsHistoryItem;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.CurrentBonusesItem;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.CurrentNpc;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.Experience;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.ExperienceBonusMapItemsItem;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.GoalsBookBookmarksItem;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.GrowingSpotsTutorialItem;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.LegendaryRecipeBookmarksItem;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.MapPosition;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.NpcBonusesItem;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.NpcQueueItem;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.PestlePosition;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.PestleRotation;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.PlayerInventoryItem;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.PotionEffectMapItemsItem;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.PreviousPotionRecipe;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.RecipeBookBookmarksItem;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.SavedColorsItem;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.SavedRecipesItem;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.Scales;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.ScalesPotionItem;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.SerializedCurrentPotion;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.SerializedDefaultBottleSettings;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.Slots;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.SpawnedNpcQueueItem;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.SpoonDirtyPartsListItem;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.SpoonPosition;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.SpoonRotation;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.Talents;
import org.firstsarcasm.potion.craft.save.converter.dto.prefs.TutorialState;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class PlayerPrefsDto {
	private int currentSuitability;
	private int previousHaggleHashCode;
	private List<Object> pestleStainsToRemove;
	private Boolean isHagglingStarted;
	private List<Object> mortarStainsToRemove;
	private String defaultPotionBaseName;
	private List<SpoonDirtyPartsListItem> spoonDirtyPartsList;
	private List<ColorsHistoryItem> colorsHistory;
	private List<Object> currentMortarStains;
	private List<Object> brewedLegendaryRecipes;
	private List<SavedRecipesItem> savedRecipes;
	private int currentRoom;
	private Boolean showTalentsNotification;
	private int unlockedLegendaryRecipesNotificationCount;
	private List<String> unlockedPotionBases;
	private String version;
	private SpoonPosition spoonPosition;
	private List<Object> traderTradingPanelInventory;
	private List<Object> itemCostMultipliers;
	private MapPosition mapPosition;
	private double pointerPosition;
	private PestleRotation pestleRotation;
	private List<Object> itemsFromInventory;
	private Boolean isPlayerVisitedMeetingRoomAfterDayStart;
	private List<Object> traderInventory;
	private List<ChunksItem> chunks;
	private Boolean withSpawnedProduct;
	private int playerPanelType;
	private int tutorialNpcQueueCount;
	private int traderPanelType;
	private int gold;
	private Boolean followIndicatorButtonState;
	private List<SavedColorsItem> savedColors;
	private int popularity;
	private List<CurrentBonusesItem> currentBonuses;
	private List<Boolean> unlockedPotionBasesRead;
	private List<PotionEffectMapItemsItem> potionEffectMapItems;
	private String selectedPotionBaseName;
	private List<String> readDialogueNodes;
	private PreviousPotionRecipe previousPotionRecipe;
	private int karma;
	private List<PlayerInventoryItem> playerInventory;
	private List<GoalsBookBookmarksItem> goalsBookBookmarks;
	private List<NpcBonusesItem> npcBonuses;
	private int pointerDirection;
	private List<String> currentDialoguePath;
	private List<String> unlockedLegendaryRecipes;
	private int currentLegendaryRecipeIndex;
	private int unlockedRecipesPagesCount;
	private Experience experience;
	private int stateBeforeHaggleStarted;
	private Boolean isPotionItemOnScales;
	private Boolean canTakeIngredients;
	private List<SpawnedNpcQueueItem> spawnedNpcQueue;
	private int currentPotionRecipeIndex;
	private double windSpeed;
	private int day;
	private List<NpcQueueItem> npcQueue;
	private Boolean potionChangedAfterSavingRecipe;
	private int currentChapterIndex;
	private SerializedCurrentPotion serializedCurrentPotion;
	private Slots slots;
	private int servedNpcCount;
	private int nextDialogueState;
	private Scales scales;
	private double timeWhenSaved;
	private ScalesPotionItem scalesPotionItem;
	private Boolean isAnimating;
	private int currentSpaceIndexForColor;
	private CurrentNpc currentNpc;
	private double heat;
	private List<String> legendaryRecipes;
	private int pointerState;
	private List<ExperienceBonusMapItemsItem> experienceBonusMapItems;
	private List<ChaptersGroupsItem> chaptersGroups;
	private List<Object> growingSpotsMain;
	private List<Object> dialoguesLocalConditionProperties;
	private PestlePosition pestlePosition;
	private List<Object> dialoguesGlobalConditionProperties;
	private List<GrowingSpotsTutorialItem> growingSpotsTutorial;
	private CoalsHeat coalsHeat;
	private int spoonAnimationFrameNumber;
	private List<LegendaryRecipeBookmarksItem> legendaryRecipeBookmarks;
	private List<RecipeBookBookmarksItem> recipeBookBookmarks;
	private List<String> readUnlockedLegendaryRecipes;
	private SpoonRotation spoonRotation;
	private int totalDayNpcCount;
	private Boolean isOkButtonClicked;
	private double previousHeat;
	private List<Object> playerTradingPanelInventory;
	private double zoom;
	private int currentLevel;
	private SerializedDefaultBottleSettings serializedDefaultBottleSettings;
	private int currentRecipeIndex;
	private List<Object> currentPestleStains;
	private Talents talents;
	private TutorialState tutorialState;

	public void addEveryInventoryItemCount(int amount) {
		this.setPlayerInventory(this.getPlayerInventory()
				.stream()
				.peek(s -> s.setCount(s.getCount() + amount))
				.collect(Collectors.toList()));
	}

	public void setMapPosition(double x, double y) {
		this.setMapPosition(new MapPosition(x, y));
	}

	public void setExperienceAsNextLevelAmount() {
		Experience experience = this.getExperience();
		experience.setCurrentExp(experience.getNextLvlAt());
	}

	public void setTalentPoints(int currentPoints) {
		this.getTalents().setCurrentPoints(currentPoints);
	}

}