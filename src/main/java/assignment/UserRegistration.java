package assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean validateFirstName(String firstname) {
		// first name starts with capital letter and have minimum 3 characters
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(firstname);
		return matcher.matches();
	}

	public boolean validateLastName(String lastname) {
		// last name starts with capital letter and have minimum 3 characters
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(lastname);
		return matcher.matches();
	}

	public boolean validateEmail(String email) {
		// method to validate email
		Pattern pattern = Pattern.compile("(abc)[-.+0-9a-z]*@[a-z0-9]+[.][a-z]{0,3}[.]?[a-z]{0,2}$");
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public boolean validatePhoneNumber(String phonenumber) {
		// method to validate phone number
		Pattern pattern = Pattern.compile("[0-9]{2} [0-9]{10}");
		Matcher matcher = pattern.matcher(phonenumber);
		return matcher.matches();
	}

	public boolean validatePassWord(String password) {
		// method to validate password with minimum 8 characters and atleast one digit,
		// capital letter & special character
		Pattern pattern = Pattern.compile("[A-Z]+[0-9]+[@$&#]{1}\\w{5,}");
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}

	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		System.out.println(user.validateFirstName("Sunil")); // valid input
		System.out.println(user.validateFirstName("sunil")); // invalid input
		System.out.println(user.validateLastName("Kumar")); // valid input
		System.out.println(user.validateLastName("kumar")); // invalid input
		System.out.println(user.validateEmail("abc.xyz@bl.co.in")); // valid input
		System.out.println(user.validateEmail("abcd.xyz@bl.com.in")); // invalid input
		System.out.println(user.validatePhoneNumber("91 9164144279")); // valid input
		System.out.println(user.validatePhoneNumber("919164144279")); // invalid input
		System.out.println(user.validatePassWord("A1@aS7ft")); // valid input
		System.out.println(user.validatePassWord("sUat8yt")); // invalid input
	}
}
