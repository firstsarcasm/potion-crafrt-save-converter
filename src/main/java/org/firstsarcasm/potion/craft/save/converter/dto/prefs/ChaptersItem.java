package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import java.util.List;
import lombok.Data;

public @Data class ChaptersItem{
	private String name;
	private ChapterGoal chapterGoal;
	private List<GoalsItem> goals;
}