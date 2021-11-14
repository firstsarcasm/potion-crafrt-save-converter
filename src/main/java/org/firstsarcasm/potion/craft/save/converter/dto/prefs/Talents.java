package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import java.util.List;
import lombok.Data;

public @Data class Talents{
	private int currentPoints;
	private List<String> earnedTalentsNames;
}