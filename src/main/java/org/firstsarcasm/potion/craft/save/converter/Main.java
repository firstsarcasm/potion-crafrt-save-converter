package org.firstsarcasm.potion.craft.save.converter;

import org.firstsarcasm.potion.craft.save.converter.constant.SaveFileNumber;
import org.firstsarcasm.potion.craft.save.converter.converter.PcSavesConverter;
import org.firstsarcasm.potion.craft.save.converter.dto.PlayerPrefsDto;
import org.firstsarcasm.potion.craft.save.converter.dto.SaveFileDto;
import org.firstsarcasm.potion.craft.save.converter.manager.SaveFileManager;
import org.firstsarcasm.potion.craft.save.converter.manager.SaveFileTextManager;
import org.firstsarcasm.potion.craft.save.converter.manager.impl.SaveFileManagerImpl;
import org.firstsarcasm.potion.craft.save.converter.manager.impl.SaveFileTextManagerImpl;

import java.io.IOException;

public class Main {

	private static final PcSavesConverter CONVERTER = new PcSavesConverter();

	public static void main(String[] args) throws Exception {

		modifySaveFile();
//		convertAsTextFile();
	}

	private static void modifySaveFile() throws IOException {
		SaveFileManager saveFileManager = new SaveFileManagerImpl(CONVERTER);
		SaveFileDto saveFileObject = saveFileManager.readAsObject("For_test_Save3.pcsave");
		PlayerPrefsDto playerPrefsDto = saveFileObject.getPlayerPrefsDto();

		playerPrefsDto.setGold(99999);
		playerPrefsDto.setTalentPoints(100);
		playerPrefsDto.setKarma(100);
		playerPrefsDto.setExperienceAsNextLevelAmount();
		playerPrefsDto.addEveryInventoryItemCount(50);

		saveFileManager.saveObjectAsSaveFile(saveFileObject, SaveFileNumber.THREE);
	}

	private static void convertAsTextFile() throws IOException {
		SaveFileTextManager saveFileTextManager = new SaveFileTextManagerImpl(CONVERTER);
		String jsonFileName = saveFileTextManager.decodeAndSave("For_test_Save3.pcsave");
		saveFileTextManager.jsonToSave(jsonFileName, "Save1 - 2021.11.13 11.53.07.598 UTC - Day 23.pcsave");
	}


}