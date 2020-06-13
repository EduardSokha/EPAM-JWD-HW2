package by.sokhaeduard.secondhw.task3;

public class PrintArray {
    public void printArrayWithRandom(int[] ms) {
        for (int i = 0; i < ms.length; i++) {
            System.out.print(ms[i] + " ");
        }
        for (int i = 1; i < ms.length; i++) {
            System.out.print("\n" + ms[i]);
        }
    }
}
