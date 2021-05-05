package com.gokul;

import java.util.ArrayList;
import java.util.HashMap;

public class TamilLanguages {
	//creating ArrayList for each movie to store songs
	static ArrayList<String>Master=new ArrayList<String>();
	static ArrayList<String>SooraraiPotru=new ArrayList<String>();
	static HashMap <String,ArrayList<String>> TamilMovieSongs=new HashMap<String,ArrayList<String>>();
	
	
	static
	{   // First Movie Songs
		Master.add("vaathiComing");
		Master.add("vaathiraid");
		// Second Movie Songs
		SooraraiPotru.add("MaaraTheme");
		SooraraiPotru.add("Mannurunda");
		//adding songs in the Hash map  with movie name as key
		TamilMovieSongs.put("Master",Master);
		TamilMovieSongs.put("SooraraiPotru",SooraraiPotru);
	}

	
/**
 * Accepting Movie as a key 
 * it displays list of songs available
 * @param Movie
 */
	public static boolean doesMovieExist(String Movie) {
		boolean isExists = false;
		 try {
			 isExists = TamilMovieSongs.containsKey(Movie);
		} catch (Exception e) {
	       System.out.println("Movie does not exists" + e);
			isExists = false;
		}
		 return isExists;
	}

	/**
	 *  it displays list of songs available
	 * @param Movie
	 */
	public static void displayAllSongs(String Movie) {
		if (doesMovieExist(Movie)) {
			 System.out.println("hii");
			 ArrayList<String> songs =  TamilMovieSongs.get(Movie);
			 for (String song : songs) {
					System.out.println("Songs : " + song);
				}
		}
		else
		{
			System.out.println("Movie Does Not Exist");
		}
	}
 
}
