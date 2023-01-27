public class PIP_5_4 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int z = 8;
        char spacja = ' ';
        char gwiazdka = '*';
        int max = Math.max(x, Math.max(y, z));
        for(int i = 0; i < Math.max(x, Math.max(y, z)); i++) {
            if (x >= max) {
                System.out.print(gwiazdka);}
            else {
                System.out.print(spacja);}
            System.out.print(spacja);
            if (y >= max) {
                System.out.print(gwiazdka);}
            else {
                System.out.print(spacja);}
            System.out.print(spacja);
            if (z >= max) {
                System.out.print(gwiazdka);}
            else {
                System.out.print(spacja);}
            System.out.println(spacja);
            max--;}
    }
}
