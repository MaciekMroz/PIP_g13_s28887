import java.util.Arrays;
import java.util.Random;

public class PIP6Z4 {
    public static int[] generateArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }
    public static int[] reverse(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - i - 1];
        }
        return reversed;
    }
    public static boolean equalsReverse(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] genArr = generateArray(100);
        printArray(genArr);

        int[] sortedArr = sort(genArr);
        printArray(sortedArr);

        int[] revArr = reverse(sortedArr);
        printArray(revArr);

        System.out.println(equalsReverse(sortedArr, revArr)); // should display false
    }
}