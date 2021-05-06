package com.gokul;

import java.util.ArrayList;
import java.util.HashMap;

public class HindiLanguage {

	// creating ArrayList for each movie to store songs
	static ArrayList<String> DILBECHARA = new ArrayList<String>();
	static ArrayList<String> CHHICHHORE = new ArrayList<String>();
	static HashMap<String, ArrayList<String>> HindiMovieSongs = new HashMap<String, ArrayList<String>>();

	static { // First Movie Songs
		DILBECHARA.add("meintumhara");
		DILBECHARA.add("friendZone");
		// Second Movie Songs
		CHHICHHORE.add("Khairiyat");
		CHHICHHORE.add("FikarNot");
		// adding songs in the Hash map with movie name as key
		HindiMovieSongs.put("DILBECHARA", DILBECHARA);
		HindiMovieSongs.put("CHHICHHORE", CHHICHHORE);
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
				isExists = HindiMovieSongs.containsKey(Movie);
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
				ArrayList<String> songs = HindiMovieSongs.get(Movie);
				for (String song : songs) {
					System.out.println("Songs : " + song);
				}
			} else {
				System.out.println("Movie Does Not Exist");
			}
		}
	}

	public static int getTotalHindiSongsCount() {
		int size = 0;
		for (String Movie : HindiMovieSongs.keySet()) {
			ArrayList<String> songs = HindiMovieSongs.get(Movie);
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
		songList = HindiMovieSongs.get(MovieName);
		System.out.println(songList);
		boolean songExists = songList.contains(song);
		if (songExists) {
			exists = true;
		}

		return exists;

	}

}