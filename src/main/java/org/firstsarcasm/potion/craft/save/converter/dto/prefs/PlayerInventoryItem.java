package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import lombok.Data;

public @Data class PlayerInventoryItem{
	private String data;
	private String name;
	private int count;
	private String className;
}