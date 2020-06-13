package by.sokhaeduard.secondhw.task6;

import by.sokhaeduard.secondhw.readLine.ReadLine;

public class SixthTask {
	public static void main(String[] args) {
		ReadLine readLine = new ReadLine();

		int monthForTask = readLine.getInt("enter time for task");
		String name = readLine.getString("enter name");

		DateService dateService = new DateService();
		dateService.getFinishTime(monthForTask, name);

		readLine.scClose();
	}
}
