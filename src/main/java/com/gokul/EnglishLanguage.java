package com.gokul;

import java.util.ArrayList;
import java.util.HashMap;

public class EnglishLanguage {
	//creating array list for adding songs
	static ArrayList<String>IMAGINEDRAGANS=new ArrayList<String>();
	static ArrayList<String>MARSHMELLO=new ArrayList<String>();
	static HashMap <String,ArrayList<String>> EnglishMovieSongs=new HashMap<String,ArrayList<String>>();
	
	
	static
	{   // First Movie Songs
		IMAGINEDRAGANS.add("Whatever it takes");
		IMAGINEDRAGANS.add("Thunder");
		// Second Movie Songs
		MARSHMELLO.add("ok not to be ok");
		MARSHMELLO.add("Friends");
		//adding songs in the Hash map  with movie name as key
		EnglishMovieSongs.put("IMAGINEDRAGANS",IMAGINEDRAGANS);
		EnglishMovieSongs.put("MARSHMELLO",	MARSHMELLO);
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
		 isExists = EnglishMovieSongs.containsKey(Movie);
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
		 ArrayList<String> songs =  EnglishMovieSongs.get(Movie);
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

public static int getTotalEnglishSongsCount()
{
	 int size=0;
	 for(String Movie:EnglishMovieSongs.keySet())
	 {
	  ArrayList<String> songs =EnglishMovieSongs.get(Movie);
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
if(!language.equals(null))
{
 valid=true;
}

return valid;
	
}

}
