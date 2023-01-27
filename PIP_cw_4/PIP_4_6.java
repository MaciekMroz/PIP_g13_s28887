import java.util.Random;
import java.util.Scanner;

public class PIP_4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę rzeczywistą: ");
        double x = scanner.nextDouble();
        System.out.println("Podaj pierwszą liczbę rzeczywistą: ");
        double y = scanner.nextDouble();
        if(x > y) {
            double z = x;
            x = y;
            y = z;
        }
        System.out.println("Wybrany przedzial: " + "[" + x + " , " + y + "]");
        Random generator = new Random();

        double l3 = generator.nextDouble() * (y - x) + x;
        double l2 = generator.nextDouble() * (l3 - x) + x;
        double l1 = generator.nextDouble() * (l2 - x) + x;

        System.out.println("Liczby wygenerowane losowo: ");
        System.out.println(l1 + " < " + l2 + " < " + l3);


    }
}