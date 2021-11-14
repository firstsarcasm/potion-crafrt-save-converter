package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import java.util.List;
import lombok.Data;

public @Data class Slots{
	private List<MValuesItem> mValues;
	private List<String> mKeys;
}