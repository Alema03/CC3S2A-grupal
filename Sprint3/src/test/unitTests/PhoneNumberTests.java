package test.unitTests;

import junit.framework.TestCase;
import production.business.UserAccount;


public class PhoneNumberTests extends TestCase {

	public void testValidPhoneNumber() {
		assertTrue(UserAccount.isPhoneNumberValid("123456789"));
		assertTrue(UserAccount.isPhoneNumberValid("906756164"));
		assertTrue(UserAccount.isPhoneNumberValid("957566071"));
	}

	public void testInValidPhoneNumber() {
		assertFalse(UserAccount.isPhoneNumberValid("1234567890"));
		assertFalse(UserAccount.isPhoneNumberValid("876sub3455"));
		assertFalse(UserAccount.isPhoneNumberValid("987 898 7689"));
	}
}
