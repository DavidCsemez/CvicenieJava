public class viacRozmernePolia {
    public static void main(String[] args) {
        int pole[][];
        int cislo=1;
        pole= new int[15][15];
        for(int i=0; i< pole.length;i++){
            for (int j=0;j< pole[i].length;j++){
                pole[i][j]=cislo;
                ++cislo;
            }
        }
        for(int i=0; i< pole.length;i++){
            for (int j=0;j< pole[i].length;j++){
                System.out.print(pole[i][j]+"\t");
            }
            System.out.println();
        }

        for(int i=0; i<=9;i++){
            for (int j=1;j<=10;j++){
                System.out.print((10*i+j)+"\t");
            }
            System.out.println();
        }
        System.out.println("\n");


        int nasobok=1;
        for (int i = 0; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(nasobok + " ");
                nasobok *= 2;
            }
            System.out.println();
        }
    }
}
