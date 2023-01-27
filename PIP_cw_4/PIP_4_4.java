import java.util.Scanner;

public class PIP_4_4 {

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
            case "ADD" -> System.out.println("Suma wynosi: " + (a + b));
            case "SUB" -> System.out.println("Różnica wynosi: " + (a - b));
            case "MUL" -> System.out.println("Iloczyn wynosi: " + (a * b));
            case "DIV" -> System.out.println("Iloraz wynosi: " + (a / b));
            default -> System.out.println("Nieprawidłowe polecenie");
        }
    }
}