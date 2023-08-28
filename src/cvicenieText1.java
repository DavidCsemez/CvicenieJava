import java.util.Scanner;

public class cvicenieText1 {
    public static void main(String[] args) {
        Scanner skener=new Scanner(System.in);
        String text= skener.nextLine();
        String textL=text.toLowerCase();
        String textU=text.toUpperCase();
        System.out.println(textL);
        System.out.println(textU);
        skener.close();
    }
}
