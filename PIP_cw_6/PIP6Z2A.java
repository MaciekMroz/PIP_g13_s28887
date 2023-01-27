import java.util.Calendar;
import java.util.Random;

public class PIP6Z2A {
    public static int[] sortArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int currentDay = cal.get(Calendar.DAY_OF_MONTH);
        int maxNum = currentDay + 5;
        Random random = new Random();
        int n = random.nextInt(maxNum);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(101);
        }
        int[] sortedArray = sortArray(array);
        for (int i : sortedArray) {
            System.out.print(i + " ");
        }
    }
}