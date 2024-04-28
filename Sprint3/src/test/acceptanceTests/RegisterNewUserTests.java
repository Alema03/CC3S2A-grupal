package test.acceptanceTests;

import junit.framework.TestCase;
import production.business.UserAccountManager;

public class RegisterNewUserTests extends TestCase{

	private UserAccountManager userAccountManager;
	private int result;

	protected void setUp() throws Exception {
		super.setUp();
		userAccountManager = new UserAccountManager();
		userAccountManager.registerNewUser("marcelo78", "Password123#", "Password123#", "Marcelo",
				"Nunez", "marcelogerson7@gmail.com", "906756164");
	}

	public void testSuccessfulRegistration() {

		String registrationResult = userAccountManager.registerNewUser("marcelo78", "Password123#", "Password123#", "Marcelo",
				"Nunez", "marcelogerson7@gmail.com", "906756164");
		assertEquals(registrationResult, UserAccountManager.NOINPUTERROR);
		result = userAccountManager.login("Venkat517", "Hello@World123");
		assertTrue(result==1);

	}

	public void testRegistrationWithInvalidEmail() {
		String registrationResult = userAccountManager.registerNewUser("marcelo78", "Password123#", "Password123#", "Marcelo",
				"Nunez", "marcelogerson7@gmail", "906756164");
		System.out.println(registrationResult);
		assertFalse(registrationResult.equalsIgnoreCase(UserAccountManager.NOINPUTERROR));
	}

	public void testRegistrationWithInvalidUserName() {
		String registrationResult = userAccountManager.registerNewUser("@#marcelo78", "Password123#", "Password123#", "Marcelo",
				"Nunez", "marcelogerson7@gmail.com", "906756164");
		System.out.println(registrationResult);
		assertFalse(registrationResult.equalsIgnoreCase(UserAccountManager.NOINPUTERROR));
	}


	public void testRegistrationWithInvalidPassword() {
		String registrationResult = userAccountManager.registerNewUser("marcelo78", "Password123#", "contraseñainvalida123#", "Marcelo",
				"Nunez", "marcelogerson7@gmail.com", "906756164");
		System.out.println(registrationResult);
		assertFalse(registrationResult.equalsIgnoreCase(UserAccountManager.NOINPUTERROR));
	}
}
