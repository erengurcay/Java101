import java.util.Scanner;

public class HesapMakinesi {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyıyı giriniz :");
        int birinciSayi = input.nextInt();
        System.out.println("İkinci sayıyı giriniz :");
        int ikinciSayi = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        int secim = input.nextInt();
        if (secim == 1) {
            System.out.println("toplama işlemi : " + (birinciSayi + ikinciSayi));
        } else if (secim == 2) {
            System.out.println("çıkartma işlemi : " + (birinciSayi - ikinciSayi));
        } else if (secim == 3) {
            System.out.println("çarpma işlemi : " + birinciSayi * ikinciSayi);
        } else if (secim == 4) {
            System.out.println("bölme işlemi : " + birinciSayi / ikinciSayi);
        }

    }
}