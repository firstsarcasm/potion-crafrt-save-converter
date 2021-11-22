package org.firstsarcasm.potion.craft.save.converter.manager.impl;

import org.firstsarcasm.potion.craft.save.converter.converter.PcSavesConverter;
import org.firstsarcasm.potion.craft.save.converter.constant.SaveFileNumber;
import org.firstsarcasm.potion.craft.save.converter.dto.PlayerPrefsDto;
import org.firstsarcasm.potion.craft.save.converter.dto.SaveFileDto;
import org.firstsarcasm.potion.craft.save.converter.manager.SaveFileManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public record SaveFileManagerImpl(PcSavesConverter converter) implements SaveFileManager {

	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy.MM.dd HH.mm.ss.SSS");

	@Override
	public SaveFileDto readAsObject(String saveFileName) throws IOException {
		Path path = Paths.get("src/main/resources/" + saveFileName);
		List<String> strings = Files.readAllLines(path);

		return converter.toJsonObject(strings);
	}

	@Override
	public void saveObjectAsSaveFile(SaveFileDto saveFileDto, SaveFileNumber saveFileNumber) throws IOException {
		String str = converter.fromJsonObject(saveFileDto);

		String targetSaveFileFullName = makeSaveFileName(saveFileDto.getPlayerPrefsDto(), saveFileNumber.getValue());
		Path resultPath = Paths.get("src/main/resources/" + targetSaveFileFullName);
		Files.writeString(resultPath, str);
	}


	private String makeSaveFileName(PlayerPrefsDto playerPrefsDto, final String saveNumber) {
		String currentTime = LocalDateTime.now().format(DATE_TIME_FORMATTER);
		return "Save%s - %s UTC - Day %d.pcsave".formatted(saveNumber, currentTime, playerPrefsDto.getDay());
	}
}
