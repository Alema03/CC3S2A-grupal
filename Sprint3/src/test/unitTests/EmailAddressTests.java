package test.unitTests;

import junit.framework.TestCase;
import production.business.UserAccount;


public class EmailAddressTests extends TestCase {

	public void testValidEmailAddress() {
		assertTrue(UserAccount.isEmailValid("marcelogerson7@gmail.com"));
		assertTrue(UserAccount.isEmailValid("holamacaco@amazon.in"));
		assertTrue(UserAccount.isEmailValid("dotabestgame@canvas.com"));
	}

	public void testInvalidValidEmailAddress() {
		assertFalse(UserAccount.isEmailValid("@google.com"));
		assertFalse(UserAccount.isEmailValid("falla@amazon.i"));
		assertFalse(UserAccount.isEmailValid("otra:falla@gmail.com"));
	}
}