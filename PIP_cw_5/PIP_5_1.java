import java.util.Scanner;
import static java.lang.Math.abs;

public class PIP_5_1 {
    public static void main(String[] args){
        Scanner liczba=new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita n:");
        int n=liczba.nextInt();
        if(n >= 0) {
            for (int i = 0; i <= n; i++) {
                System.out.print(i + "; ");
            }
        }
        else if (n < 0){
            for(int i=0; i >= n; i--){
                System.out.print(i + "; ");
            }
        }
    }
}