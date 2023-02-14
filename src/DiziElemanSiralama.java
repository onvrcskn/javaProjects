import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanSiralama {
    static int[] diziSirala(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                int temp = arr[i];
                if (arr[i] > arr[k]) {
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.print("Dizi Boyutu n = ");
        int boyut = tara.nextInt();
        int[] dizi = new int[boyut];
        System.out.print("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < boyut; i++) {
            int eleman = tara.nextInt();
            dizi[i] += eleman;
            System.out.println((i + 1) + ". Elemanı : " + dizi[i]);
        }
        diziSirala(dizi);
        System.out.println("Sıralama : " + Arrays.toString(dizi));
    }
}


