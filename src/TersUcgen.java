import java.util.Scanner;

public class TersUcgen {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayısını girin: ");
        int basamakSayisi = scanner.nextInt();
        scanner.close();

        for(int i = basamakSayisi; i >= 1; --i) {
            int k;
            for(k = basamakSayisi; k > i; --k) {
                System.out.print(" ");
            }

            for(k = 1; k <= 2 * i - 1; ++k) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}