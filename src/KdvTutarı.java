import java.util.Scanner;

public class KdvTutarı {


    public static void main(String[] args) {
        double kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("ücret tutarını gir: ");
        double tutar = input.nextDouble();
        double kdvTutar = tutar * kdvOran;
        double sonTutar = tutar + kdvTutar;
        System.out.println(sonTutar);
    }
}