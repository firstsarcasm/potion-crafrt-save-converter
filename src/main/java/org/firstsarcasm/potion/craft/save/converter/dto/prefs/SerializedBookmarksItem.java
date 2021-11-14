package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import lombok.Data;

public @Data class SerializedBookmarksItem{
	private Boolean isMirrored;
	private int prefabIndex;
	private Position position;
}