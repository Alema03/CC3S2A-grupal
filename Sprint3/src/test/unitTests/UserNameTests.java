package test.unitTests;

import junit.framework.TestCase;
import production.business.UserAccount;


public class UserNameTests extends TestCase {

	public void testValidUserName() {
		assertTrue(UserAccount.isUserNameValid("MarceloLZR"));
		assertTrue(UserAccount.isUserNameValid("marcelo420"));
		assertTrue(UserAccount.isUserNameValid("CLEVER"));
	}

	public void testInValidUserName() {
		assertFalse(UserAccount.isUserNameValid("$clever"));
		assertFalse(UserAccount.isUserNameValid("Clever8_9"));
		assertFalse(UserAccount.isUserNameValid("Maycoll R749"));
	}
}
