import java.text.SimpleDateFormat;
import java.util.Date;

public class cvicenie {
    public static void main(String[] args) {
        String datumNarodenia = "03.04.2000";
        double znamka = 1.5;
        int rokMaturity = 2022;
        Date datum=new Date();
        SimpleDateFormat formatDatumu=new SimpleDateFormat("dd.MM.yyyy");
        System.out.print("Študent Jozef Mrkvička sa narodil "+datumNarodenia+", z maturitnej skúšky má známku ");
        System.out.printf("%.2f ",znamka);
        System.out.println(" a od septembra "+rokMaturity+" nastupi do noveho zamestnania ako Java programator.");
        System.out.println("V Bratislave dňa "+formatDatumu.format(datum));
    }
}
