import java.util.Scanner;

public class CinZodyagi {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz : ");
        int dogumYılı = input.nextInt();
        int kalan = dogumYılı % 12;
        if (kalan == 0) {
            System.out.println("Çin Zodyağı Burcunuz Maymun ");
        } else if (kalan == 1) {
            System.out.println("Çin Zodyağı Burcunuz Horoz ");
        } else if (kalan == 2) {
            System.out.println("Çin Zodyağı Burcunuz Köpek ");
        } else if (kalan == 3) {
            System.out.println("Çin Zodyağı Burcunuz Domuz ");
        } else if (kalan == 4) {
            System.out.println("Çin Zodyağı Burcunuz Fare ");
        } else if (kalan == 5) {
            System.out.println("Çin Zodyağı Burcunuz öküz ");
        } else if (kalan == 6) {
            System.out.println("Çin Zodyağı Burcunuz kaplan ");
        } else if (kalan == 7) {
            System.out.println("Çin Zodyağı Burcunuz tavşan ");
        } else if (kalan == 8) {
            System.out.println("Çin Zodyağı Burcunuz ejderha ");
        } else if (kalan == 9) {
            System.out.println("Çin Zodyağı Burcunuz Yılan ");
        } else if (kalan == 10) {
            System.out.println("Çin Zodyağı Burcunuz At ");
        } else if (kalan == 11) {
            System.out.println("Çin Zodyağı Burcunuz Koyun ");
        }

    }
}