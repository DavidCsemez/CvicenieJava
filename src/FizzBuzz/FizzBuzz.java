package FizzBuzz;

import com.sun.source.tree.WhileLoopTree;
/*
Hra Fizz Buzz vytvorená automaticky, to znamená, že v intervale od 1 po 100 vypíše všetky čísla a čísla delitelne tromi nahradí slovom fizz a čísla delitelné piaťimi sa nahradía slovom buzz. Ak číslo je delitelné tromi aj piaťimi číslo bude nahradené slovným spojeným fizz buzz
 */
public class FizzBuzz {
    public static void main(String[] args) {
        int cislo=1;
        while(cislo!=101 && cislo<=101){
            int delenie3=cislo%3;
            int delenie5=cislo%5;
            if(delenie3==0 && delenie5==0){
                System.out.println("Fizz Buzz");
            } else if (delenie3==0){
                System.out.println("Fizz");
            } else if (delenie5==0){
                System.out.println("Buzz");
            }
            else System.out.println(cislo);
            ++cislo;
        }
    }
}
