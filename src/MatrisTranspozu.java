import java.util.Scanner;

public class MatrisTranspozu {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("Matrisin boyutlarını giriniz! \n Satır Sayısı : ");
        int a = tara.nextInt();
        System.out.println("Sütun Sayısı : ");
        int b = tara.nextInt();
        int eleman = 0;
        int[][] dizi = new int[a][b];
        int[][] Tdizi = new int[b][a];

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.println(i + ". Satır " + j + ". Sutünun elamanını giriniz.");
                eleman = tara.nextInt();
                dizi[i - 1][j - 1] = eleman;
                Tdizi[j - 1][i - 1] = eleman;
            }
        }
        System.out.println("Matris : ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Transpoze : ");
        for (int j = 0; j < b; j++) {
            for (int i = 0; i < a; i++) {
                System.out.print(Tdizi[j][i]+" ");
            }
            System.out.println("");
        }
    }
}
