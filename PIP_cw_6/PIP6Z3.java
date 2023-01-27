import java.util.Arrays;
import java.util.Random;

public class PIP6Z3 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(11) + 5;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}