package by.sokhaeduard.secondhw.task5;

public class FifthTask {
	public static void main(String[] args) {
		Counter counter = new Counter();
		int[] ms = counter.getSum(args);

		System.out.println("sum = " + ms[0] + "product of numbers" + ms[1]);
	}
}
