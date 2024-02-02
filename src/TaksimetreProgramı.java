import java.util.Scanner;

public class TaksimetreProgramı {


    public static void main(String[] args) {
        double perKm = 2.2;
        double acilisUcreti = 10.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz. ");
        double km = input.nextDouble();
        double total = km * perKm;
        total += acilisUcreti;
        System.out.println("Toplam tutar : " + total);
    }
}
