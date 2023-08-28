import java.util.Scanner;

public class cvicenieCisla {
    public static void main(String[] args) {
        Scanner skener=new Scanner(System.in);
        int cislo=0;
        double cisloZadane=0;
        System.out.println("Zadajte cele cislo");
        cislo=skener.nextInt();
        System.out.println("Zadaje desatinne cislo");
        cisloZadane=skener.nextDouble();
        System.out.println("Zadane cisla");
        System.out.println(cislo);
        System.out.printf("%.3f%n", cisloZadane);
        System.out.println("Prevedene cislo");
        double cisloDouble=cislo;
        float cisloFloat=4.55f;
        System.out.println(cisloDouble);
        System.out.println(cisloFloat);
        System.out.printf("%.2f", cisloDouble);
        skener.close();
    }
}
