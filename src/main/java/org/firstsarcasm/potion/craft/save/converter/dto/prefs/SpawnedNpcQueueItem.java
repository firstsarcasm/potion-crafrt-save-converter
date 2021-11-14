package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import lombok.Data;

public @Data class SpawnedNpcQueueItem{
	private NpcForSpawn npcForSpawn;
	private int state;
}