import java.util.Scanner;

public class cvicenieMath {
    public static void main(String[] args) {
        Scanner skener=new Scanner(System.in);
        System.out.println("Zadajte prvé cislo: ");
        double cislop=skener.nextDouble();
        System.out.println("Zadajte druhé cislo: ");
        double cislod= skener.nextDouble();
        System.out.println(Math.sqrt(cislop));
        int random=(int) (Math.random()*101);
        System.out.println(random);
    }
}
