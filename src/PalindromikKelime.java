import java.util.Scanner;

public class PalindromikKelime {
    static boolean isPalindrome(String str) {
        int i = 0;
        boolean isPalidrom = true;
        while (!(i == str.length() / 2)) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                isPalidrom = true;
            } else {
                isPalidrom = false;
            }
            i++;
        }
        return isPalidrom;
    }

    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("Kelime Giriniz : ");
        String kelime = tara.nextLine();
        if (isPalindrome(kelime)) {
            System.out.println("Kelime Palindromik");
        } else System.out.println("Kelime Palindromik Değil!");
    }
}
