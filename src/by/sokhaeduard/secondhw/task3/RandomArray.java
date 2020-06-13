package by.sokhaeduard.secondhw.task3;

import java.util.Random;

public class RandomArray {
    private Random random = new Random();

    public int[] arrayWithRandom(int count) {
        int[] ms = new int[count];
        for (int i = 0; i < count; i++) {
            ms[i] = random.nextInt(10000);
        }
        return ms;
    }
}
