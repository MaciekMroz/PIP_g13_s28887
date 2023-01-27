import java.util.Random;

public class PIP6Z1 {
    public static int[] createArray(int n) {
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(101);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10) + 1;
        int[] generatedArray = createArray(n);
        printArray(generatedArray);
    }
}