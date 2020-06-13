package by.sokhaeduard.secondhw.task4.service;

import by.sokhaeduard.secondhw.readLine.ReadLine;
import by.sokhaeduard.secondhw.task4.entity.Password;

public class PasswordChecker {

	public boolean comparePassword(Password password) {
		if (password.getPassw1().equals(password.getPassw2())) {
			System.out.println("passw1 = passw2");
			return true;
		}
		return false;
	}

	public void validPasssw(Password password) {
		while (!comparePassword(password)) {
			ReadLine readLine = new ReadLine();
			password.setPassw2(readLine.getString("enter password"));
			validPasssw(password);
		}
	}
}
