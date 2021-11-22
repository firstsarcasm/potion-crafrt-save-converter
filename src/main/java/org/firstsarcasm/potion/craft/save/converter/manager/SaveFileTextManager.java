package org.firstsarcasm.potion.craft.save.converter.manager;

import java.io.IOException;

public interface SaveFileTextManager {

	/**
	 * Converts save file decoded as json to .pcsave format
	 * @param jsonFileFullName the name of save file decoded as json
	 * @param targetSaveFileFullName the name of .pcsave file. For instance "Save2 - 2021.11.15 16.16.28.297 UTC - Day 23.pcsave"
	 */
	void jsonToSave(String jsonFileFullName, String targetSaveFileFullName) throws IOException;

	/**
	 * @param saveFileName for instance "Save2 - 2021.11.15 16.16.28.297 UTC - Day 23.pcsave"
	 * @return the name of the file decoded as json
	 */
	String decodeAndSave(String saveFileName) throws IOException;

}
