package by.sokhaeduard.secondhw.task7;

import java.util.Calendar;
import java.util.GregorianCalendar;

import by.sokhaeduard.secondhw.readLine.ReadLine;

public class SeventhTask {

	public static void main(String[] args) {

		ReadLine readLine = new ReadLine();

		int year = readLine.getInt("enter year of birthday");
		int month = readLine.getInt("enter month of birthday");
		int day = readLine.getInt("enter day of birthday");

		Calendar calendar = new GregorianCalendar(year, month, day);
		PrintDay printDay = new PrintDay();
		DateService dateService = new DateService();
		
		int dayWeek = dateService.getDayWeek(calendar);
		int yearsOld = dateService.getYearsOld(calendar);
		boolean birthday = dateService.getBirthDay(calendar);

		printDay.outDayWeek(dayWeek);
		printDay.getHappyBirthday(birthday);

		System.out.println("You are " + yearsOld + " years old");

		readLine.scClose();
	}

}
