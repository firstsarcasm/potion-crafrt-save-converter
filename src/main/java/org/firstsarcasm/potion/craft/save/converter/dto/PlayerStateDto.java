package org.firstsarcasm.potion.craft.save.converter.dto;

import lombok.Data;

@Data
public  class PlayerStateDto {
	private String savedStateTypeName;
	private String customName;
	private String saveTime;
	private int savePool;
	private int day;
	private String version;
}