package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import java.util.List;
import lombok.Data;

public @Data class TutorialState{
	private String setName;
	private int stepIndex;
	private String resetState;
	private List<Object> manipulatedObjectsLock;
}