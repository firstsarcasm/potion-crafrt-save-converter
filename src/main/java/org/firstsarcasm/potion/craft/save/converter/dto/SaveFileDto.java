package org.firstsarcasm.potion.craft.save.converter.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaveFileDto {
	private PlayerStateDto playerStateDto;
	private PlayerPrefsDto playerPrefsDto;
}
