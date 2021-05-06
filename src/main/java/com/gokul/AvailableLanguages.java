package com.gokul;

import java.util.ArrayList;

public class AvailableLanguages {

	static ArrayList<String> LanguageList = new ArrayList<String>();
	static {
		LanguageList.add("TAMIL");
		LanguageList.add("HINDI");
		LanguageList.add("ENGLISH");
	}

	/**
	 * it displays all the available languages
	 */
	public static void displayAvailableLanguages() {
		System.out.println("----Available Languages----");
		for (String language : LanguageList) {
			System.out.println(language);
		}

	}

	/**
	 * accepts language as input checks for language available or not
	 * 
	 * @param language
	 * @return
	 */
	public static boolean isLanguageAvailable(String language) {
		boolean isAvailable = false;
		if (stringValidator(language)) {
			language = language.toUpperCase();

			if (LanguageList.contains(language)) {

				isAvailable = true;
			}

		}

		return isAvailable;
	}

	/**
	 * it returns the total number of languages count.
	 * 
	 * @return
	 */
	public static int totalLanguagesCount() {
		int songsCount = LanguageList.size();
		return songsCount;

	}

	/**
	 * Accepts input language and checks whether the string is not null returns true
	 * if not null else return false
	 * 
	 * @param language
	 * @return
	 */
	public static boolean stringValidator(String language) {
		boolean isvalid = true;
		// language=language.trim();
		String specialCharacters = "!@#$%&*()'+,-./:;<=>?[]^_{}";
		try {
			for (int i = 0; i < language.length(); i++) {
				char ch = language.charAt(i);
				if (language == null || language.equals("") || specialCharacters.contains(Character.toString(ch))) {
					isvalid = false;
					break;
				}
			}
		} catch (Exception e) {
			//System.out.println("Null Pointer Exception");
		}
		return isvalid;
	}
}
