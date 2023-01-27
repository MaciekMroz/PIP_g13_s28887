import java.util.Scanner;

public class PIP_4_1 {
    public static void main(String[] args) {

        Scanner pogoda=new Scanner(System.in);
        System.out.println("Odpowiedz true or falsetrue");
        System.out.println("Czy pada?:");
        boolean czyPada= pogoda.nextBoolean();

        System.out.println("Czy świeci słońce?:");
        boolean czySwieciSlonce= pogoda.nextBoolean();

        if(czyPada==true){
            if(czySwieciSlonce==true){
                System.out.println("Tęcza");}
            else {
                System.out.println("Plucha");}
        }if (czyPada==false) {
            if (czySwieciSlonce==true){
                System.out.println("Słonecznie");}
            else {
                System.out.println("Pochmurno");}
        }
    }
}