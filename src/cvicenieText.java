import java.util.Scanner;

public class cvicenieText {
    public static void main(String[] args) {
        Scanner skener=new Scanner(System.in);
        String text=skener.nextLine();
        System.out.println(text);
        System.out.printf("%10s%s%n","",text);
        System.out.printf("%-10s%100s%s%n",text,"a",text);
        skener.close();
    }
}
