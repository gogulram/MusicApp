package in.gogle;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gokul.TamilLanguages;

public class TamilLanguageTest {

	// it checks that whether all the songs are displayed
	@Test
	public void testForDisplayingSongs() {
		
		TamilLanguages.displayAllSongs("master");
		
	}
	// it checks whether the given movie is available with available movie
	
	@Test
	public void MovieExistorNotWithCorrectDetails() {
		String Movie="MAster";
		boolean exist=TamilLanguages.doesMovieExist( Movie);
		assertEquals(true,exist);
	
	}
	// it checks whether the given movie is available with  not available movie
	
		@Test
		public void MovieExistorNotWithIncorrectDetails() {
			String Movie="MAster";
			boolean exist=TamilLanguages.doesMovieExist( Movie);
			assertEquals(true,exist);
		
		}
	
	/**
	 * it checks for the total songs count
	 */
	@Test
	public void testForTotalSongsCount()
	{
		int songsCount=TamilLanguages.getTotalTamilSongsCount();
		assertEquals(songsCount,4);
		
	}
	
	
}
