import java.util.Scanner;

public class cyklus {
    public static void main(String[] args) {
        Scanner skener=new Scanner(System.in);
        String cislo=skener.nextLine();
        if (cislo.matches("[0-9]+")) {
            int cisloI=Integer.parseInt(cislo);
            while (cisloI != 100 && cisloI<100) {
                System.out.println(cisloI);
                cisloI +=2;
            }
        }
        else System.out.println("Nezadali ste číslo");
    }
}
