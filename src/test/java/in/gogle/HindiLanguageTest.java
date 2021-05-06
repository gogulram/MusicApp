package in.gogle;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gokul.HindiLanguage;

public class HindiLanguageTest {

	// it checks that whether all the songs are displayed
	@Test
	public void testForDisplayingSongs() {

		HindiLanguage.displayAllSongs("CHHICHHORE");

	}
	// it checks whether the given movie is available with available movie

	@Test
	public void MovieExistorNotWithCorrectDetails() {
		String Movie = "CHHICHHORE";
		boolean exist = HindiLanguage.doesMovieExist(Movie);
		assertTrue(exist);

	}
	// it checks whether the given movie is available with not available movie

	@Test
	public void MovieExistorNotWithIncorrectDetails() {
		String Movie = "CHHiCHHO";
		boolean exist = HindiLanguage.doesMovieExist(Movie);
		assertFalse(exist);

	}

	/**
	 * test for total songs count in hindi
	 */
	@Test
	public void testForTotalSongsCount() {
		int songsCount = HindiLanguage.getTotalHindiSongsCount();
		assertEquals(songsCount, 4);

	}

	/**
	 * test for searching a song which is available in database
	 */
	@Test
	public void SearchForSongsWithAvailableSong() {
		String movieName = "DILBECHARA";
		String songName = "friendZone";
		boolean isAvailable = HindiLanguage.searchSongs(movieName, songName);
		assertTrue(isAvailable);
	}

	/**
	 * test for searching a song which is not available
	 */
	@Test
	public void SearchForSongsWithNotAvailableSong() {
		String movieName = "CHHICHHORE";
		String songName = "Khairiyat2";
		boolean isAvailable = HindiLanguage.searchSongs(movieName, songName);
		assertFalse(isAvailable);
	}

}
