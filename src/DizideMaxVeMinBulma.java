import java.util.Scanner;

public class DizideMaxVeMinBulma {
    public static void main(String[] args) {
        int sayi;
        System.out.println("Bi sayı giriniz : ");
        Scanner tara = new Scanner(System.in);
        sayi = tara.nextInt();

        int[] list = {15,12,788,1,-1,-778,2,0};

        int min = sayi;
        int max = sayi;
        int temp;
        int temp1;
        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        for (int i : list) {
            if (i < sayi) {
                temp = i;
                if (temp > min) {
                    min = i;
                }
            }
            if (i > sayi) {
                temp = i;
                if (temp < max) {
                    max = i;
                }
            }
        }

        System.out.println(sayi+" Sayısına En Yakın Minimum Değer " + min);
        System.out.println(sayi+" Sayısına En Yakın Maximum Değer " + max);

    }
}
