package by.sokhaeduard.secondhw.task2;

public class ReverseArgs {
    public void printReverse(String[] data) {
        if (data==null | data.length==0) {
            throw new RuntimeException("Your must enter arguments!");
        }
        int length = data.length;
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
    }
}
