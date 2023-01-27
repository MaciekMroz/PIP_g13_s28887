import java.util.Scanner;

public class PIP_4_5 {

    public static void main(String[] args) {

        String dzialanie;
        System.out.println("Wprowadz pierwszą liczbę: ");
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("Wprowadz drugą liczbę: ");
        b = scanner.nextInt();

        System.out.println("Jakie działanie chcesz wykonać");
        System.out.println("Dodawanie, odjemowanie, mnożenie, dzielenie?");
        System.out.println("ADD;       SUB;         MUL;      DIV?");
        System.out.println("Podaj odpowiedni skrót");
        dzialanie = scanner.next();

        switch (dzialanie) {
            case "ADD" -> {
                int x = a + b;
                System.out.println("Suma wynosi: " + x);
                absoluteValue(x);
            }
            case "SUB" -> {
                int x = a - b;
                System.out.println("Róźnica wynosi: " + x);
                absoluteValue(x);
            }
            case "MUL" -> {
                int x = a * b;
                System.out.println("Iloczyn wynosi: " + x);
                absoluteValue(x);
            }
            case "DIV" -> {
                int x = a / b;
                System.out.println("Iloraz wynosi: " + x);
                absoluteValue(x);
            }
            default -> System.out.println("Nieprawidłowe polecenie");
        }
    }
        private static void absoluteValue(int x) {

            int z = Math.abs(x);

            System.out.println(x + " => " + z);
        }

    }