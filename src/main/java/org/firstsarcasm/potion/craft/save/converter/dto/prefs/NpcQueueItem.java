package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import lombok.Data;

public @Data class NpcQueueItem{
	private SpawnPosition spawnPosition;
	private String npcTemplateName;
	private double pathTweenFullPosition;
	private boolean pauseBeforeSpawn;
	private TradingRandomState tradingRandomState;
	private PartsGenerationRandomState partsGenerationRandomState;
}