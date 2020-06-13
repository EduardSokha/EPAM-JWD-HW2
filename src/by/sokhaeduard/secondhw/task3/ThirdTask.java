package by.sokhaeduard.secondhw.task3;

import by.sokhaeduard.secondhw.readLine.ReadLine;

public class ThirdTask {
	public static void main(String[] args) {
		ReadLine readIn = new ReadLine();
		int countArray = readIn.getInt("enter count array");

		RandomArray randomArray = new RandomArray();
		int[] array = randomArray.arrayWithRandom(countArray);

		PrintArray printArray = new PrintArray();
		printArray.printArrayWithRandom(array);
	}
}
