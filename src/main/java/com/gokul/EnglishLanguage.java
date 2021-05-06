package com.gokul;

import java.util.ArrayList;
import java.util.HashMap;

public class EnglishLanguage {
	// creating array list for adding songs
	static ArrayList<String> IMAGINEDRAGANS = new ArrayList<String>();
	static ArrayList<String> MARSHMELLO = new ArrayList<String>();
	static HashMap<String, ArrayList<String>> EnglishMovieSongs = new HashMap<String, ArrayList<String>>();

	static { // First Movie Songs
		IMAGINEDRAGANS.add("Whateverittakes");
		IMAGINEDRAGANS.add("Thunder");
		// Second Movie Songs
		MARSHMELLO.add("oknottobeok");
		MARSHMELLO.add("Friends");
		// adding songs in the Hash map with movie name as key
		EnglishMovieSongs.put("IMAGINEDRAGANS", IMAGINEDRAGANS);
		EnglishMovieSongs.put("MARSHMELLO", MARSHMELLO);
	}

	/**
	 * Accepting Movie as a key returns true if a movie is available else it returns
	 * false
	 * 
	 * @param Movie
	 */

	public static boolean doesMovieExist(String Movie) {
		boolean isExists = false;

		Movie = Movie.toUpperCase();

		try {
			if (AvailableLanguages.stringValidator(Movie))
				isExists = EnglishMovieSongs.containsKey(Movie);
		} catch (Exception e) {
			System.out.println("Movie does not exists" + e);
			isExists = false;
		}

		return isExists;
	}

	/**
	 * it displays list of songs available
	 * 
	 * @param Movie
	 */
	public static void displayAllSongs(String Movie) {
		Movie = Movie.toUpperCase();
		if (AvailableLanguages.stringValidator(Movie)) {
			if (doesMovieExist(Movie)) {
				ArrayList<String> songs = EnglishMovieSongs.get(Movie);
				for (String song : songs) {
					System.out.println("Songs : " + song);
				}
			} else {
				System.out.println("Movie Does Not Exist");
			}
		}
	}

	public static int getTotalEnglishSongsCount() {
		int size = 0;
		for (String Movie : EnglishMovieSongs.keySet()) {
			ArrayList<String> songs = EnglishMovieSongs.get(Movie);
			for (String song : songs) {
				size++;

			}

		}
		return size;
	}

	public static boolean searchSongs(String MovieName, String song) {
		boolean exists = false;
		MovieName = MovieName.toUpperCase();

		ArrayList<String> songList = new ArrayList<String>();
		songList = EnglishMovieSongs.get(MovieName);
		System.out.println(songList);
		boolean songExists = songList.contains(song);
		if (songExists) {
			exists = true;
		}

		return exists;

	}

}
