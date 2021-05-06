package com.gokul;

import java.util.ArrayList;
import java.util.HashMap;

public class PlayListCreation {

	static HashMap<String, ArrayList<String>> allPlayLists = new HashMap<String, ArrayList<String>>();

	static {
		createPlayList("k");
		createPlayList("k222");

		addSongsToPlayList("k", "friend");
		addSongsToPlayList("k", "helo");
		addSongsToPlayList("k222", "friend2");

		showMyPlaylist("k");
		showMyPlaylist("k222");

	}

	/**
	 * accepts playListName as input creates arrayList and stores in hash Map with
	 * PlayListName as a key
	 * 
	 * @param playListName
	 */
	public static boolean createPlayList(String playListName) {

		boolean created = false;
		if (!(isPlayListAvailable(playListName))) {
			ArrayList<String> arr = new ArrayList<String>();
			allPlayLists.put(playListName, arr);
		}
		// checks that playlist is created ,return true if created or not else it return
		// false
		//
		if (isPlayListAvailable(playListName)) {
			created = true;
		}
		return created;

	}

	/**
	 * adds song in arrayList with specifies playListName
	 * 
	 * @param playlistName
	 * @param song
	 */
	public static boolean addSongsToPlayList(String playlistName, String song) {
		boolean added = false;
		try {

			allPlayLists.get(playlistName).add(song);
			if (searchSongsInPlayList(playlistName, song)) {
				added = true;
			}
		} catch (Exception e) {
		}
		return added;

	}

	/**
	 * displays all playlist and all songs
	 * 
	 * @param playlistName
	 */
	public static void showMyPlaylist(String playlistName) {
		try {

			System.out.println(playlistName + ":" + allPlayLists.get(playlistName));

		}
		catch (Exception e) {

		}

	}

	/**
	 * checks for the hashmap key as playListName in allplayLists
	 * 
	 * @param playListName
	 * @return
	 */
	public static boolean isPlayListAvailable(String playListName) {

		boolean exists = false;
		if (allPlayLists.containsKey(playListName)) {
			exists = true;
		}
		return exists;
	}

	public static boolean searchSongsInPlayList(String playListName, String song) {
		boolean exists = false;

		ArrayList<String> songList = new ArrayList<String>();
		songList = allPlayLists.get(playListName);
		boolean songExists = songList.contains(song);
		if (songExists) {
			exists = true;
		}

		return exists;

	}

}
