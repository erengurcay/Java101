import java.util.Scanner;

public class vkeHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kilonuuzu giriniz: ");
        double kilo = input.nextDouble();
        System.out.println("boyunuzu giriniz: ");
        double boy = input.nextDouble();
        double vke = kilo / (boy * boy);
        System.out.println("Vücut kile endeksiniz : " + vke);
    }
}
