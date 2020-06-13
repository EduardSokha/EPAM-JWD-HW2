package by.sokhaeduard.secondhw.task5;

public class Counter {
	public int[] getSum(String[] args) {
		if (args == null || args.length == 0) {
			throw new RuntimeException("Enter arguments!");
		}
		int sum = 0;
		int multiplier = 0;

		for (String string : args) {
			int stri = Integer.parseInt(string);
			sum += stri;
			multiplier *= stri;
		}

		int[] result = { sum, multiplier };

		return result;
	}
}
