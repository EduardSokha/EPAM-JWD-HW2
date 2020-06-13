package by.sokhaeduard.secondhw.task4;

import by.sokhaeduard.secondhw.readLine.ReadLine;
import by.sokhaeduard.secondhw.task4.entity.Password;
import by.sokhaeduard.secondhw.task4.service.PasswordChecker;

public class FourthTask {
	public static void main(String[] args) {
		Password password = new Password();
		ReadLine readLine = new ReadLine();
		password.setPassw2(readLine.getString("enter password"));

		PasswordChecker passwordChecker = new PasswordChecker();
		passwordChecker.validPasssw(password);
	}
}
