import java.util.Scanner;

public class PIP_4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witamy w kantorze");
        System.out.println("Wybierz walutę?: ");
        System.out.println("1 - PLN");
        System.out.println("2 - JPY");
        double JPY = 31.0183318;
        double PLN = 0.032239;
        String waluta = scanner.next();
        System.out.println("Podaj kwotę: ");
        double x = scanner.nextDouble();
        double y = x * JPY;
        double z = x * PLN;
        switch (waluta) {
            case "1" -> System.out.println(x + " " + "zł" + "=>" + y + " " + "¥");
            case "2" -> System.out.println(x + " " + "¥" + "=>" +z + " " + "zł");
            default -> System.out.println("Nie wybrano poprawnie waluty");
        }
    }
}