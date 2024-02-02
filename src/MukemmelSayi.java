import java.util.Scanner;

public class MukemmelSayi {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayı gir. ");
        int sayi = scanner.nextInt();
        int total = 0;

        for(int i = 1; i < sayi; ++i) {
            if (sayi % i == 0) {
                total += i;
            }
        }

        if (total == sayi) {
            System.out.println("" + sayi + " Mükemmel sayidir");
        } else {
            System.out.println("" + sayi + " Mükemmel sayı değildir.");
        }

    }
}