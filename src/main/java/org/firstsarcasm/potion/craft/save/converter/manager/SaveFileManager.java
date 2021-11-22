package org.firstsarcasm.potion.craft.save.converter.manager;

import org.firstsarcasm.potion.craft.save.converter.constant.SaveFileNumber;
import org.firstsarcasm.potion.craft.save.converter.dto.SaveFileDto;

import java.io.IOException;

public interface SaveFileManager {

	/**
	 * @param saveFileName for instance "Save2 - 2021.11.15 16.16.28.297 UTC - Day 23.pcsave"
	 * @return save file json deserialized to object
	 */
	SaveFileDto readAsObject(String saveFileName) throws IOException;


	/**
	 * @param saveFileDto dto to convert to .pcsave file
	 * @param saveFileNumber the number after the "Save" word in the save file name.
	 * For instance with {@link SaveFileNumber#TWO} the method produces a file with
	 * the name "Save2 - 2021.11.15 16.16.28.297 UTC - Day 23.pcsave .
	 */
	void saveObjectAsSaveFile(SaveFileDto saveFileDto, SaveFileNumber saveFileNumber) throws IOException;

}
