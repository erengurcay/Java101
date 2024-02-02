import java.util.Scanner;

public class NotOrtalaması {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Mat notunuz: ");
        int mat = inp.nextInt();
        System.out.println("Fizik notunuz: ");
        int fizik = inp.nextInt();
        System.out.println("Kimya notunuz: ");
        int kimya = inp.nextInt();
        System.out.println("Türkçe notunuz: ");
        int türkce = inp.nextInt();
        System.out.println("Tarih notunuz: ");
        int tarih = inp.nextInt();
        System.out.println("Müzik notunuz: ");
        int müzik = inp.nextInt();
        int toplam = mat + fizik + tarih + türkce + müzik + kimya;
        double sonuc = (double)toplam / 6.0;
        System.out.println("Ortalamanız: " + sonuc);
    }
}