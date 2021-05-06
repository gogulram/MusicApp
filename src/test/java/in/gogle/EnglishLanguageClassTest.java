
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
		String Movie = "IMAGINED_Gans";
		boolean exist = EnglishLanguage.doesMovieExist(Movie);
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
	 * test for searching a song which is available in database
	 */
	@Test
	public void SearchForSongsWithAvailableSong() {
		String movieName = "Marshmello";
		String songName = "Friends";
		boolean isAvailable = EnglishLanguage.searchSongs(movieName, songName);
		assertTrue(isAvailable);
	}

	/**
	 * test for searching a song which is not available
	 */
	@Test
	public void SearchForSongsWithNotAvailableSong() {
		String movieName = "IMAGINEDRAGans";
		String songName = "Friends";
		boolean isAvailable = EnglishLanguage.searchSongs(movieName, songName);
		assertFalse(isAvailable);
	}
}
