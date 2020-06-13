package by.sokhaeduard.secondhw.task6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateService {

	public void getFinishTime(int month, String name) {
		Calendar calendar = new GregorianCalendar();
		calendar.add(Calendar.MONTH, month);
		String finishTime = new SimpleDateFormat("dd.MM.yyyy").format(calendar.getTime());
		System.out.println(name + " will be finished this task at " + finishTime);
	}

}
