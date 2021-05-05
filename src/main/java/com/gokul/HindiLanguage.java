package com.gokul;

import java.util.ArrayList;
import java.util.HashMap;

public class HindiLanguage {

	//creating ArrayList for each movie to store songs
	static ArrayList<String>DILBECHARA=new ArrayList<String>();
	static ArrayList<String>CHHICHHORE=new ArrayList<String>();
	static HashMap <String,ArrayList<String>> HindilMovieSongs=new HashMap<String,ArrayList<String>>();
	
	
	static
	{   // First Movie Songs
		DILBECHARA.add("mein tumhara");
		DILBECHARA.add("friendZone");
		// Second Movie Songs
		CHHICHHORE.add("Khairiyat");
		CHHICHHORE.add("Fikar Not");
		//adding songs in the Hash map  with movie name as key
		HindilMovieSongs.put("DILBECHARA", DILBECHARA);
		HindilMovieSongs.put("CHHICHHORE",	CHHICHHORE);
	}

	
	/**
	 * Accepting Movie as a key 
	 *returns true if a movie is available
	 *else it returns false
	 * @param Movie
	 */
    public static boolean doesMovieExist(String Movie) {
		boolean isExists = false;
    	Movie=Movie.toUpperCase();
    	
		 try {
			 if(stringValidator(Movie))
			 isExists = HindilMovieSongs.containsKey(Movie);
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
		Movie=Movie.toUpperCase();
		if(stringValidator(Movie))
		{
		if (doesMovieExist(Movie)) {
			 System.out.println("hii");
			 ArrayList<String> songs =  HindilMovieSongs.get(Movie);
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
	public static int getTotalHindiSongsCount()
	{
		 int size=0;
		 for(String Movie:HindilMovieSongs.keySet())
		 {
		  ArrayList<String> songs = HindilMovieSongs.get(Movie);
			 for(String song:songs)
			 {
				 size++;
				 
			 }
	   	 
	     }
		 return size;
	}
	public static boolean stringValidator(String language)
	{
	
	boolean valid=false;
	if(language!=" ")
	{
	 valid=true;
	}
	
	return valid;
		
	}
	

 }