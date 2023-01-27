import java.util.Scanner;

public class PIP_5_3 {
    public static void main(String[] args) {
        Scanner liczba = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita n:");
        int n = liczba.nextInt();

        if (n % 2 == 0) {
            n -= 1;}
        choinka(n);}
    public static void choinka(int n) {

        int linie = ((n + 1) / 2);
        for (int linia = 0; linia < linie; linia++) {

            int puste = linie - linia - 1;
            int gwiazdki = n - 2 * puste;

            int i = 0;
            if ((n - i) % 2 != 0) {
                for (i = 0; i <puste; i++) {
                    System.out.print(" ");}
                for (i = 0; i < gwiazdki; i++) {
                    System.out.print("*");}
                System.out.println();}
        }
    }
}