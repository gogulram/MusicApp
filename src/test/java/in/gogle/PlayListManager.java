package in.gogle;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gokul.PlayListCreation;

public class PlayListManager {
  
	/**
	 * test whether play list created or not
	 */
	@Test
	public void testPlayListCreator() {
		
		String name="mySongs";
		 boolean success=PlayListCreation.createPlayList(name);
		 assertEquals(true,success);
	}
	/**
	 * checks that Adding song to playList
	 */
	@Test
	public void testAddSongsToPlaylist()
	{
		String playListName="mySongs";
		String song="kabaddi";
		 boolean success=PlayListCreation.addSongsToPlayList(playListName,song);
		//PlayListCreation.showMyPLayList();
	   assertTrue(success);
		
	}
	/**
	 * adding songs to incorrect playList 
	 */
	@Test
	public void testAddSongsToIncorrectPlayList()
	{
		String playListName="songs";
		String song="kabaddi";
		 boolean success=PlayListCreation.addSongsToPlayList(playListName,song);
		//PlayListCreation.showMyPLayList();
	   assertFalse(success);
		
	}
	
 /**
  * checks that song is added in playList or not  
  */
	@Test
	public void testSearchForSongwithCorrectDetails()
	{
		String playListName="mySongs";
		String songName="kabaddi";
		PlayListCreation.createPlayList(playListName);
		PlayListCreation.addSongsToPlayList(playListName,songName);
		boolean success=PlayListCreation.searchSongsInPlayList(playListName,songName);
		assertTrue(success);
	}
	/**
	 * search 
	 */
	@Test
	public void testSeachForSongWithIncorrectDetails()
	{
		String playListName="mySongs";
		String songName="kabadi";
		
		PlayListCreation.createPlayList(playListName);
		PlayListCreation.addSongsToPlayList(playListName,songName);
		boolean success=PlayListCreation.searchSongsInPlayList(playListName,songName);
		assertTrue(success);
		
	}
	/**
	 * test for displaying a playlist
	 */
	@Test
	public void showPlaylistTest() {
		String playlistName="mySongs";
		PlayListCreation.showMyPlaylist(playlistName);
	}
	
	

}
