package com.gokul;

import java.util.ArrayList;
import java.util.HashMap;

public class TamilLanguages {
	//creating ArrayList for each movie to store songs
	static ArrayList<String>MASTER=new ArrayList<String>();
	static ArrayList<String>SOORARAIPOTRU=new ArrayList<String>();
	static HashMap <String,ArrayList<String>> TamilMovieSongs=new HashMap<String,ArrayList<String>>();
	
	
	static
	{   // First Movie Songs
		MASTER.add("vaathiComing");
		MASTER.add("vaathiraid");
		// Second Movie Songs
		SOORARAIPOTRU.add("MaaraTheme");
		SOORARAIPOTRU.add("Mannurunda");
		//adding songs in the Hash map  with movie name as key
		TamilMovieSongs.put("MASTER",MASTER);
		TamilMovieSongs.put("SOORARAIPOTRU",SOORARAIPOTRU);
	}

     /**
	 * Accepting Movie as a key 
	 * it displays list of songs available
	 * @param Movie
	 */
		public static boolean doesMovieExist(String Movie) {
			boolean isExists = false;
			if(AvailableLanguages.stringValidator(Movie))
			{
			Movie= Movie.toUpperCase();
			 try {
				 isExists = TamilMovieSongs.containsKey(Movie);
			} catch (Exception e) {
		       System.out.println("Movie does not exists" + e);
				isExists = false;
			}
			}
			 return isExists;
		}

		/**
		 *  it displays list of songs available
		 * @param Movie
		 */
		public static void displayAllSongs(String Movie) {
			if(AvailableLanguages.stringValidator(Movie))
			{
			Movie=Movie.toUpperCase();
			System.out.println(Movie);
			if (doesMovieExist(Movie)) {
				
				ArrayList<String> songs = TamilMovieSongs.get(Movie);
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
	 
		/**
		 * it returns the total number of songs count
		 * @return
		 */
		 public static int getTotalTamilSongsCount()
		 {
			 int size=0;
			 for(String Movie:TamilMovieSongs.keySet())
			 {
			  ArrayList<String> songs = TamilMovieSongs.get(Movie);
				 for(String song:songs)
				 {
					 size++;
					 
				 }
	        	 
	 	     }
			 return size;
		 }
		
			public static boolean searchSongs(String MovieName, String song) {
				boolean exists = false;
				MovieName=MovieName.toUpperCase();

				ArrayList<String> songList = new ArrayList<String>();
				songList = TamilMovieSongs.get(MovieName);
				System.out.println(songList);
				boolean songExists = songList.contains(song);
				if (songExists) {
					exists = true;
				}

				return exists;

			}


}
