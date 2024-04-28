package test.unitTests;

import junit.framework.TestCase;
import production.business.UserAccount;


public class FirstNameTests extends TestCase {

	public void testValidFirstName() {
		assertTrue(UserAccount.isFirstNameValid("MarceloNunez"));
		assertTrue(UserAccount.isFirstNameValid("marcelo"));
		assertTrue(UserAccount.isFirstNameValid("CLEVER"));
	}

	public void testInValidFirstName() {
		assertFalse(UserAccount.isFirstNameValid("MAYCOLL22342"));
		assertFalse(UserAccount.isFirstNameValid("Maycoll@"));
		assertFalse(UserAccount.isFirstNameValid("I Ma_ycoLL"));
	}
}

