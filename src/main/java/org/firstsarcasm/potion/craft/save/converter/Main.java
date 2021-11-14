package org.firstsarcasm.potion.craft.save.converter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

public class Main {

	private static final PcSavesConverter PC_SAVES_CONVERTER = new PcSavesConverter();

	public static void main(String[] args) throws Exception {

//		saveToJson("For_test_Save3.pcsave");
		jsonToSave(
				"pcsave0ffcb0bd-c942-4760-b004-22c6c10c0d7e.json",
				"Save1 - 2021.11.13 11.53.07.598 UTC - Day 23.pcsave"
		);
	}

	private static void saveToJson(final String saveFileFullName) throws IOException {
		Path path = Paths.get("src/main/resources/" + saveFileFullName);
		List<String> strings = Files.readAllLines(path);

		String json = Main.PC_SAVES_CONVERTER.toJson(strings);
		Path decodedSaveFilePath = Paths.get("src/main/resources/pcsave" + UUID.randomUUID() + ".json");
		Files.writeString(decodedSaveFilePath, json);
	}

	private static void jsonToSave(final String jsonFileFullName, final String targetSaveFileFullName) throws IOException {
		Path path = Paths.get("src/main/resources/" + jsonFileFullName);
		List<String> strings = Files.readAllLines(path);
		String str = Main.PC_SAVES_CONVERTER.fromJson(strings);

		Path resultPath = Paths.get("src/main/resources/" + targetSaveFileFullName);
		Files.writeString(resultPath, str);
	}

}