package by.sokhaeduard.secondhw.task7;

public class PrintDay {

	public void outDayWeek(int day) {
		String result = null;
		switch (day) {
		case 1:
			result = "Monday";
			break;
		case 2:
			result = "Tuesday";
			break;
		case 3:
			result = "Wednesday";
			break;
		case 4:
			result = "Thursday";
			break;
		case 5:
			result = "Friday";
			break;
		case 6:
			result = "Saturday";
			break;
		case 7:
			result = "Sunday";
			break;
		default:
			break;
		}
		System.out.println("Day of birthday: " + result);
	}

	public void getHappyBirthday(boolean index) {
		if (index) {
			System.out.println("Happy birthday to you!");
		}
	}

}
