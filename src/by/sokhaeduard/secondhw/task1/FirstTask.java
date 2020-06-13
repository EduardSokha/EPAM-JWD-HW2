package by.sokhaeduard.secondhw.task1;

import by.sokhaeduard.secondhw.readLine.ReadLine;

public class FirstTask {
	public static void main(String[] args) {
		ReadLine readLine = new ReadLine();
		String name = readLine.getString("enter your name");
		Hello hello = new Hello();
		hello.printHello(name);
	}
}
