package test.acceptanceTests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import production.business.UserAccountManager;

public class LoginTests {

	private UserAccountManager userAccountManager;

	@Before
	public void setUp() throws Exception {
		userAccountManager = new UserAccountManager();
		userAccountManager.registerNewUser("marcelo78", "Password123#", "Password123#", "Marcelo",
				"Nunez", "marcelogerson7@gmail.com", "906756164");
	}

	@Test
	public void login_with_correct_username_and_password_succeeds() {
		int result = userAccountManager.login("marcelo78", "Password123#");
		assertEquals(1, result); // Asumimos que 1 significa éxito
	}

	@Test
	public void login_with_incorrect_password_fails() {
		String registrationResult = userAccountManager.registerNewUser("marcelo78", "Password123#", "Password123#", "Marcelo",
				"Nunez", "marcelogerson7@gmail.com", "906756164");
		assertEquals(UserAccountManager.NOINPUTERROR, registrationResult);

		int result = userAccountManager.login("marcelo78", "Password123"); // Contraseña incorrecta
		assertEquals(0, result); // Asumimos que 0 significa fallo
	}
}
