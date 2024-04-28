package test.unitTests;

import junit.framework.TestCase;
import production.business.UserAccount;


public class PasswordTests extends TestCase {

	public void testValidPassword() {
		assertTrue(UserAccount.isPasswordValid("@Qw1$se"));
		assertTrue(UserAccount.isPasswordValid("Hello$World21"));
		assertTrue(UserAccount.isPasswordValid("Parciales@123"));
	}
	public void testInValidPassword() {
		assertFalse(UserAccount.isPasswordValid("@#&password123")); //Falta Mayuscula
		assertFalse(UserAccount.isPasswordValid("Hello$world"));	//Falta numeros
		assertFalse(UserAccount.isPasswordValid("QWERTY123"));		//Falta minuscula y caracteres especiales
	}
}
