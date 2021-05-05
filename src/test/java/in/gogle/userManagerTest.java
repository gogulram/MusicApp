package in.gogle;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gokul.userManager;

public class userManagerTest {
	//testcase1--->correct details
	@Test
	public void loginWithCorrectDetails() {
		    String email="ramg@gmail.com";
			String  password="1234";
			boolean isValid= userManager.isValidLogin(email,password);
			assertTrue(isValid);
		}

	// testcase2----->incorrect details
	@Test
	public void loginWithIncorrectDetails() {
	    String email="ram2@gmail.com";
		String  password="1234";
		boolean isValid= userManager.isValidLogin(email,password);
		assertFalse(isValid);
	}
	
	//testcase3----->new user registration with correct details
	
	@Test
	
	public void testForNewUserRegistration()
	{
      String email="newuser@gmail.com";
      String password="6789";
      boolean isValid=userManager.newUserRegistration(email, password);
      assertTrue(isValid);
	  
		
	}
	
	/**
	 * checks whether the user is already registered
	 * 
	 */
	@Test
	public void  isUserAlreadyAvailable()
	{
		String email="notUser@gmail.com";
		String password="1234";
		boolean isAvailable=userManager.isAlreadyUser(email,password);
		assertFalse(isAvailable);
	}
	
	/**
	 * test for displaying all the users 
	 * 
	 */
	public void showAllUsers()
	{
	userManager.showAllUsers();
		
	}

	

}
