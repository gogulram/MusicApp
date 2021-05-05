
package in.gogle;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gokul.EnglishLanguage;
import com.gokul.TamilLanguages;

public class EnglishLanguageClassTest {

	// it checks that whether all the songs are displayed
	@Test
	public void testForDisplayingSongs() {

		EnglishLanguage.displayAllSongs("IMAGINEDRAGans");

	}
	// it checks whether the given movie is available with available movie

	@Test
	public void MovieExistorNotWithCorrectDetails() {
		String Movie = "IMAGINEDRAGans";
		boolean exist = EnglishLanguage.doesMovieExist(Movie);
		assertEquals(true, exist);

	}
	// it checks whether the given movie is available with incorrect movie

	@Test
	public void MovieExistorNotWithIncorrectDetails() {
		String Movie = "IMAGINEDGans";
		boolean exist = TamilLanguages.doesMovieExist(Movie);
		assertFalse(exist);

	}

	/**
	 * checks for total songs count in english language
	 */
	@Test
	public void testForTotalSongsCount() {
		int songsCount = EnglishLanguage.getTotalEnglishSongsCount();
		assertEquals(songsCount, 4);

	}

	/**
	 * test for valid string with incorrect details
	 *
	 */
	@Test
	public void TestStringValidatorWithCorrectDetails() {
		String name = "English";
		boolean isValid = TamilLanguages.stringValidator(name);
		assertTrue(isValid);

	}

	/**
	 * test for valid string with correct details
	 *
	 */
	@Test
	public void TeststringValidatorWithIncorrectDetails() {
		String name=" ";
		boolean isValid = TamilLanguages.stringValidator(name);
		assertFalse(isValid);

	}
}
