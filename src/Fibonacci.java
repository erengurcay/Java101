import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisi için eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();
        scanner.close();
        int ilkSayi = 0;
        int ikinciSayi = 1;
        System.out.println("" + elemanSayisi + " Elemanlı Fibonacci Serisi:");

        for(int i = 1; i <= elemanSayisi; ++i) {
            System.out.print("" + ilkSayi + " ");
            int sonrakiSayi = ilkSayi + ikinciSayi;
            ilkSayi = ikinciSayi;
            ikinciSayi = sonrakiSayi;
        }

    }
}