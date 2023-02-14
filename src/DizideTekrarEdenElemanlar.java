import java.util.Arrays;

public class DizideTekrarEdenElemanlar {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] dizi = {2, 3,2, 2, 5, 8, 8, 6, 5, 4, 5, 6, 2, 8, 9, 7, 4, 6, 3, 1, 7, 9, 6, 4, 5, 4, 2, 3, 2, 1, 5};
        int[] kopya = new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            if (isFind(kopya, dizi[i])) {
                int tekrar = 0;
                for (int j = 0; j < dizi.length; j++) {
                    if (dizi[i] == dizi[j]) {
                        tekrar++;
                    }
                }
                kopya[i] = dizi[i];
                System.out.println(dizi[i] + " sayısı " + tekrar + " kere tekrar edildi.");
            }
        }
    }
}
