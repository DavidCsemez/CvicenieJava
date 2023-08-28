import java.util.Scanner;

public class cvicenieMatikaZmenaOJedno {
    public static void main(String[] args) {
        Scanner skener=new Scanner(System.in);
        int cisloNacitane=0, cisloPridane=0, cisloOdobrate=0;
        cisloNacitane= skener.nextInt();
        cisloPridane=cisloNacitane;
        cisloOdobrate=cisloNacitane;
        System.out.println(cisloNacitane);
        System.out.println(++cisloPridane);   // hodnota premenej +1
        System.out.println(--cisloOdobrate);  // hodnota premenej -1
    }
}
