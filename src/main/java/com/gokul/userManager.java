package com.gokul;

import java.util.*;

public class userManager {

	static HashMap<String, String> userList = new HashMap<String, String>();
	/**
	 * default two users added userList 
	 */
	static
	{
        userList.put("ramg@gmail.com", "1234");
		userList.put("Dharshini@live.com", "5678");
   
	}


/**
 * it checks that email is  available in that userList
 * And also checks for password available is correct
 * @param email
 * @param password
 * @return
 */
	public static boolean loginValidation(String email, String password) {
		boolean exists = false;
//		for(User user : userList)
//		{
//			if((user.email.equalsIgnoreCase(email) )&& user.password.equalsIgnoreCase(password))
//			{
//				exists = true;
//				break;
//			}
//		}
		if (isAlreadyUser(email ,password)) {
			exists = true;
		}
		return exists;
	}

	/**
	 * accepts email and password as input
	 * it passes email and password to loginValidation function 
	 * @param email
	 * @param password
	 * @return
	 */
	public static boolean isValidLogin(String email, String password) {
	   boolean validUser=false;
		if (loginValidation(email, password)) {
			//System.out.println("Successfully logged in");
			validUser=true;
		}
		return validUser;
	}
/**
 * it add a new user in hashMap with email as key and password as value
 * @param email
 * @param Password
 * @return
 */
	public static boolean newUserRegistration(String email, String Password) {

		userList.put(email, Password);
		return true;
		//System.out.println("Successfully Registered");
	}

	/**
	 * it displays all the list of users in userList
	 */
	public static void showAllUsers() {
		for (String key : userList.keySet()) {
			System.out.println("email id:" + key + ",password:" + userList.get(key));
		}

	}
   /**
    * accepts email and password as input 
    * checks that email and password is already available in the list.
    * @param email
    * @param password
    * @return
    */
	public static boolean isAlreadyUser(String email ,String password)
	{
		boolean exists=false;
		if (userList.containsKey(email)&& userList.containsValue(password)) {
			exists = true;
		}
		return exists;
		
	}
	
}
