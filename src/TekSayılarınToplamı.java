import java.util.Scanner;

public class TekSayılarınToplamı {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;

        int n;
        do {
            System.out.println("Sayı giriniz :");
            n = input.nextInt();
            if (n % 2 == 1) {
                toplam += n;
            }
        } while(n > 0);

        System.out.println("Toplam : " + toplam);
    }
}
