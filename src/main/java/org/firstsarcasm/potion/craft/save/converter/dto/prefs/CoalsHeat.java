package org.firstsarcasm.potion.craft.save.converter.dto.prefs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

public @Data
class CoalsHeat {

	@JsonProperty("m_values")
	private List<Double> mValues;

	@JsonProperty("m_keys")
	private List<String> mKeys;
}