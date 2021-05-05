package com.gokul;

import java.util.ArrayList;

public class AvailableLanguages {
	
	static ArrayList<String> LanguageList = new ArrayList<String>(); 
	static 
	{
		LanguageList.add("TAMIL");
		LanguageList.add("HINDI");
		LanguageList.add("ENGLISH");
	}
	/**
	 * it displays all the available languages
	 */
	public static void  displayAvailableLanguages()
	{
		System.out.println("----Available Languages----");
		for(String language:LanguageList)
		{
		     System.out.println(language);
		}
 
	}
	/**
	 * accepts language as input 
	 * checks for language available or not 
	 * @param language
	 * @return
	 */
	public static boolean isLanguageAvailable(String language)
	{
		boolean isAvailable=false;
		if(stringValidator(language))
		{
		language=language.toUpperCase();
	
		if(LanguageList.contains(language))
		{
			System.out.println("helo");
			isAvailable= true;
		}
		
		}
			
		return isAvailable;
	}
	
/**
 * it returns the total number of languages count.
 * @return
 */
	public static int totalLanguagesCount()
	{
		int songsCount=LanguageList.size();
		return songsCount;
		
	}
	
	/**
	 * Accepts input language and checks whether the string is not null 
	 * returns true if not null
	 * else return false
	 * @param language
	 * @return
	 */
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
