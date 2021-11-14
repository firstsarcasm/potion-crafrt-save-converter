package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import lombok.Data;

public @Data class SerializedBookmarksItem{
	private boolean isMirrored;
	private int prefabIndex;
	private Position position;
}