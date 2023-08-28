package FizzBuzz;

import java.util.Scanner;

/*
    Hra Fizz Buzz , ktorou zaťial môže hrať iba jeden ćlovek, hrač zapisuje ćísla pomocou konzoli postupne
       Pravidlá hry:
            - čísla, ktoré sú deliteľné tromi sa nahradí slovom fizz;
            - čísla, ktoré sú deliteľné piatimi sa nahradí slovom buzz;
            - čísla, ktoré sú deliteľné tromi aj piaťimi sa nahradí slovom fizz buzz;
    - hra je napísaná na interval od 1 po 100;
    - ak zadá menšie ćíslo ako predošlé je konie hry;
    - ak zadá väčšie číslo ako predošlé je koniec hry;
    - ak zadá číslo, ktoré je deliteľné tromi, prípadne piatimi ale súčastne oboma je koniec hry;
    - ak záda slovo fizz, buzz alebo prípadne fizz buzz na zlé miesto je koniec hry;
    program nekomunikuje s hrácom len v prípade ak je koniec hry v tom prípade vypíše GAME OVER a preruší cyklus (ukončí hru)

*/
public class FizzBuzzSkener {
    public static  void koniecHry(){
        System.out.println("GAME OVER");
        System.exit(1);
    }
    public static void main(String[] args) {
        Scanner skener=new Scanner(System.in);
        int cislo=1;
        int zadaneC=0;
        while(cislo!=101 && cislo<=101) {
            String zadane = skener.nextLine();
            int delenie3=cislo%3;
            int delenie5=cislo%5;
            if (zadane.matches("[0-9]+")) {
                zadaneC = Integer.parseInt(zadane);
                int zadaned3=zadaneC%3;
                int zadaned5=zadaneC%5;
                if (zadaneC<cislo){
                    koniecHry();
                } else if (zadaneC>cislo) {
                    koniecHry();
                } else if (zadaned3==0 && zadaned5==0) {
                    koniecHry();
                } else if (zadaned5==0) {
                    koniecHry();
                } else if (zadaned3==0) {
                    koniecHry();
                }
            } else if(zadane.equals("fizz buzz")){
                if (delenie5!=0 && delenie3!=0){
                    koniecHry();
                }
            } else if (zadane.equals("fizz")) {
                if (delenie3!=0){
                    koniecHry();
                }
            }else if (zadane.equals("buzz")) {
                if (delenie5 != 0) {
                    koniecHry();
                }
            }
            else {
                koniecHry();
            }
            ++cislo;
        }
        skener.close();
    }
}
