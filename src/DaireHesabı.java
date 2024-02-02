import java.util.Scanner;

public class DaireHesabı {

    public static void main(String[] args) {
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Yarı çap uzunluğunu giriniz : ");
        int yariCap = input.nextInt();
        System.out.println("Merkez açı değerini giriniz :");
        double a = input.nextDouble();
        double cevre = 2.0 * pi * (double)yariCap;
        double alan = pi * (double)(yariCap * yariCap);
        double daireDilimi = pi * (double)(yariCap * yariCap) * a / 360.0;
        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : " + cevre);
        System.out.println("Daire diliminin alanı : " + daireDilimi);
    }
}