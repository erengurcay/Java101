import java.util.Scanner;

public class KasaProgrami {

    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut kaç kilo?");
        double armutKg = input.nextDouble();
        System.out.println("Elma kaç kilo?");
        double elmaKg = input.nextDouble();
        System.out.println("Domates kaç kilo?");
        double domatesKg = input.nextDouble();
        System.out.println("Muz kaç kilo?");
        double muzKg = input.nextDouble();
        System.out.println("Patlıcan kaç kilo?");
        double patlıcanKg = input.nextDouble();
        double total = armut * armutKg + elma * elmaKg + domatesKg * domates + muz * muzKg + patlıcanKg * patlıcan;
        System.out.println("Toplam Tutar : " + total);
    }
}