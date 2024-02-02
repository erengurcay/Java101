import java.util.Scanner;

public class PalindromSayi {

    static boolean isPalindrom(int number) {
        int temp = number;

        int tersSayi;
        for(tersSayi = 0; temp != 0; temp /= 10) {
            int sonBasamak = temp % 10;
            tersSayi = tersSayi * 10 + sonBasamak;
        }

        return number == tersSayi;
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        System.out.println(isPalindrom(101));
    }
}