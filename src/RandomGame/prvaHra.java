package RandomGame;

import java.util.Random;
import java.util.Scanner;


public class prvaHra {
    public static int generovanie(){
        Random cislo=new Random();
        int rozsah=100;
        int int_randomcislo= cislo.nextInt(rozsah);
        return int_randomcislo;
    }

    public static void main(String[] args) {
        Scanner skener=new Scanner(System.in);
        int randomCislo=generovanie();
        System.out.println("Zadajt váš typ čísla: ");
        int zadaneCislo= skener.nextInt();
        while(zadaneCislo!=randomCislo){
            if(zadaneCislo<randomCislo){
                System.out.println("Hladané čílo je väčšie ako zadané");
            } else if (zadaneCislo>randomCislo) {
                System.out.println("Hľadané Číslo je menšie ako zadané");
            }
            zadaneCislo= skener.nextInt();
        }
        System.out.println("Našli ste hLadané číslo");
        skener.close();
    }
}
