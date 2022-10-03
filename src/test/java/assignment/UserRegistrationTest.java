package assignment;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistration user = new UserRegistration();

	@Test
	public void returnValidFirstName() {
		boolean result = user.validateFirstName("Sunil");
		Assert.assertEquals(true, result);
	}

	@Test
	public void returnInvalidFirstName() {
		boolean result = user.validateFirstName("sunil");
		Assert.assertEquals(false, result);
	}

	@Test
	public void returnValidlastName() {
		boolean result = user.validateFirstName("Kumar");
		Assert.assertEquals(true, result);
	}

	@Test
	public void returnInvalidlastName() {
		boolean result = user.validateFirstName("kumar");
		Assert.assertEquals(false, result);
	}

	@Test
	public void returnValidEmail() {
		boolean result = user.validateEmail("abc.xyz@bl.co.in");
		Assert.assertEquals(true, result);
	}

	@Test
	public void returnInvalidEmail() {
		boolean result = user.validateEmail("abcd.xyz@bl.co.in");
		Assert.assertEquals(false, result);
	}

	@Test
	public void returnValidPhoneNumber() {
		boolean result = user.validatePhoneNumber("91 9164144279");
		Assert.assertEquals(true, result);
	}

	@Test
	public void returnInvalidPhoneNumber() {
		boolean result = user.validatePhoneNumber("919164144279");
		Assert.assertEquals(false, result);
	}

	@Test
	public void returnValidPassword() {
		boolean result = user.validatePassWord("A1@aS7ft");
		Assert.assertEquals(true, result);
	}

	@Test
	public void returnInvalidPassword() {
		boolean result = user.validatePassWord("aw1@sdf");
		Assert.assertEquals(false, result);
	}
}
