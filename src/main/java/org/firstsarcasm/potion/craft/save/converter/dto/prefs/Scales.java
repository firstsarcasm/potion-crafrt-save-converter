package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import lombok.Data;

public @Data class Scales{
	private double phase;
	private boolean capAngleOnReturnFromMaxAngle;
	private boolean isFluctuating;
	private boolean isCorrectBonusClicked;
	private double fluctuationTime;
	private boolean isShaking;
	private boolean isLowestPositionOnHaggleReached;
	private boolean enablePhysics;
	private boolean isWrongPotionOnTheScales;
	private double amplitude;
	private int movingSideSign;
	private double timeCoefficient;
	private double amplitudesSum;
	private boolean isShakingToTheRight;
	private double targetAngle;
	private boolean isIncorrectBonusClicked;
	private int currentState;
	private double currentAngle;
}