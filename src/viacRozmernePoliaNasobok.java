public class viacRozmernePoliaNasobok {
    public static void main(String[] args) {
        int pole[][];
        int cislo=1;
        pole= new int[10][10];
        for(int i=0; i< pole.length;++i){
            for (int j=0;j< pole[i].length;++j){
                pole[i][j]=cislo;
                ++cislo;
            }
        }
        for(int i=0; i< pole.length;++i){
            for (int j=0;j< pole[i].length;++j){
                System.out.print(pole[i][j]+" ");
            }
            System.out.println();
        }
    }
}
