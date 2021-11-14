package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import java.util.List;
import lombok.Data;

public @Data class ChaptersGroupsItem{
	private List<ChaptersItem> chapters;
	private String name;
}