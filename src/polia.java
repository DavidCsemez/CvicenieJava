public class polia {
    public static void main(String[] args) {
        String[] cars= {"Volvo", "Audi", "Opel", "BMW",""};
        System.out.println(cars[0]);
        System.out.println(cars[3]);
        System.out.println(cars.length);
        int[] cisla={92,54,62,12};
        System.out.println(cisla[0]);
        cars[4]="Alpha";
        System.out.println(cars[4]);
        for ( String i : cars){
            System.out.print(i);
        }
    }
}
