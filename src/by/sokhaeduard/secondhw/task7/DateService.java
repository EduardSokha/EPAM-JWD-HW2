package by.sokhaeduard.secondhw.task7;

import java.util.Calendar;

public class DateService {
	
	public int getDayWeek(Calendar calendar) {
		return calendar.get(Calendar.DAY_OF_WEEK);
	}

	public int getYearsOld(Calendar birthDay) {
		Calendar today = Calendar.getInstance();
		return today.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
	}

	public boolean getBirthDay(Calendar calendar) {
		Calendar today = Calendar.getInstance();
		return ((today.get(Calendar.DATE) == calendar.get(Calendar.DATE))
				&& (today.get(Calendar.MONTH) == calendar.get(Calendar.MONTH)));
	}

}
