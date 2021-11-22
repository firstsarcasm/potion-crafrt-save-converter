package org.firstsarcasm.potion.craft.save.converter.manager.impl;

import org.firstsarcasm.potion.craft.save.converter.converter.PcSavesConverter;
import org.firstsarcasm.potion.craft.save.converter.manager.SaveFileTextManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

public record SaveFileTextManagerImpl(PcSavesConverter converter) implements SaveFileTextManager {

	@Override
	public void jsonToSave(final String jsonFileFullName, final String targetSaveFileFullName) throws IOException {
		Path path = Paths.get("src/main/resources/" + jsonFileFullName);
		List<String> strings = Files.readAllLines(path);
		String str = converter.fromJson(strings);

		Path resultPath = Paths.get("src/main/resources/" + targetSaveFileFullName);
		Files.writeString(resultPath, str);
	}

	@Override
	public String decodeAndSave(String saveFileName) throws IOException {
		Path path = Paths.get("src/main/resources/" + saveFileName);
		List<String> strings = Files.readAllLines(path);

		String json = converter.toJson(strings);
		String decodedJsonFileName = "pcsave" + UUID.randomUUID() + ".json";
		Path decodedSaveFilePath = Paths.get("src/main/resources/" + decodedJsonFileName);
		Files.writeString(decodedSaveFilePath, json);
		return decodedJsonFileName;
	}
}
