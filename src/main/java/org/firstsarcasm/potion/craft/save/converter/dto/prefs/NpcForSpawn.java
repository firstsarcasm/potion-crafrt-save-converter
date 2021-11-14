package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import lombok.Data;

public @Data class NpcForSpawn{
	private SpawnPosition spawnPosition;
	private String npcTemplateName;
	private double pathTweenFullPosition;
	private Boolean pauseBeforeSpawn;
	private TradingRandomState tradingRandomState;
	private PartsGenerationRandomState partsGenerationRandomState;
}