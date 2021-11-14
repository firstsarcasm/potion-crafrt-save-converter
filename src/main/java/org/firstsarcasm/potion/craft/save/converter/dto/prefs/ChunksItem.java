package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import java.util.List;
import lombok.Data;

public @Data class ChunksItem{
	private List<Object> tiles;
	private int mapIndex;
	private int sumOfTilesFogDensity;
	private PositionInGrid positionInGrid;
}