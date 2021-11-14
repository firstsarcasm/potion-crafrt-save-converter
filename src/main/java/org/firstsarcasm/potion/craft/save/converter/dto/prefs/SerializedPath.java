package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import java.util.List;
import lombok.Data;

public @Data class SerializedPath{
	private List<Object> fixedPathPoints;
	private GlobalCrossParameters globalCrossParameters;
	private GlobalSpiralParameters globalSpiralParameters;
	private double deletedGraphicsSegments;
	private double health;
	private double segmentLengthToDeleteFromEndDots;
	private PathPosition pathPosition;
	private double indicatorRotationValue;
	private IndicatorTargetPosition indicatorTargetPosition;
	private double segmentLengthToDeleteGraphics;
	private double segmentLengthToDeleteFromEndGraphics;
	private IndicatorPosition indicatorPosition;
	private double segmentLengthToDeletePhysics;
	private double segmentLengthToDeleteFromEndPhysics;
}