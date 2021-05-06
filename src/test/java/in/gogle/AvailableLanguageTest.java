package in.gogle;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gokul.AvailableLanguages;

public class AvailableLanguageTest {

	/**
	 * Checks that if the language is available or not If available return true else
	 * false
	 */
	@Test
	public void isAvailableLanguageTest() {

		String language = "Tamil";
		String available = "false";
		if (AvailableLanguages.isLanguageAvailable(language)) {
			available = "true";
		} else {
			available = "false";
		}
		assertEquals(available, "true");

	}

	/**
	 * checks for displaying available languages
	 */
	@Test
	public void displayAvailableLanguageTest() {
		AvailableLanguages.displayAvailableLanguages();

	}

	/**
	 * gets the total languages Count
	 */
	@Test
	public void TotalLanguagesCount() {
		int languagesCount = AvailableLanguages.totalLanguagesCount();
		assertEquals(languagesCount, 3);

	}

	/**
	 * checks for valid String by giving correct details
	 *
	 */
	@Test
	public void ValidationwithCorrectDetails() {
		String language = "Tamil";
		boolean valid = AvailableLanguages.stringValidator(language);
		System.out.println(valid);
		assertTrue(valid);

	}

	/**
	 * sending input as null and checking for valid string
	 */
	@Test
	public void stringValidationWithIncorrectDetails() {
		String language = null;
		boolean valid = AvailableLanguages.stringValidator(language);
		assertTrue(valid);
	}
}
