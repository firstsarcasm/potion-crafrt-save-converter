package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import lombok.Data;

public @Data class Scales{
	private double phase;
	private Boolean capAngleOnReturnFromMaxAngle;
	private Boolean isFluctuating;
	private Boolean isCorrectBonusClicked;
	private double fluctuationTime;
	private Boolean isShaking;
	private Boolean isLowestPositionOnHaggleReached;
	private Boolean enablePhysics;
	private Boolean isWrongPotionOnTheScales;
	private double amplitude;
	private int movingSideSign;
	private double timeCoefficient;
	private double amplitudesSum;
	private Boolean isShakingToTheRight;
	private double targetAngle;
	private Boolean isIncorrectBonusClicked;
	private int currentState;
	private double currentAngle;
}