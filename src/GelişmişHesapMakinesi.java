import java.util.Scanner;

public class GelişmişHesapMakinesi {


    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int cikarma(int a, int b) {
        int result = a - b;
        System.out.println("Sonuc : " + result);
        return result;
    }

    static int carpma(int a, int b) {
        int result = a * b;
        System.out.println("Sonuc : " + result);
        return result;
    }

    static int bölme(int a, int b) {
        int result = a / b;
        System.out.println("Sonuc : " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;

        for(int i = 1; i <= b; ++i) {
            result *= a;
        }

        System.out.println("sonuc : " + result);
        return result;
    }

    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("Sonuc : " + result);
        return result;
    }

    static int area(int a, int b) {
        int result = a * b;
        System.out.println("Alan :  " + result);
        return result;
    }

    static int cevre(int a, int b) {
        int result = 2 * (a + b);
        System.out.println("Cevre :  " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = "1- Toplama İşlemi\n2- Çıkarma işlemi\n3- Çarpma işlemi \n4- Bölme işlemi \n5- üslü Sayı Hesaplama \n6- Mod Alma\n7- Dikdkörtgen alan hesaplama\n8- Dikdörtgen cevresi hesaplama\n0- Çıkış yap";

        int secim;
        do {
            System.out.println(menu);
            System.out.println("Bir işlem seçiniz : ");
            secim = scanner.nextInt();
            System.out.println("ilk sayıyı gir");
            int a = scanner.nextInt();
            System.out.println("ikinci sayıyı gir");
            int b = scanner.nextInt();
            int result = 0;
            switch (secim) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    cikarma(a, b);
                    break;
                case 3:
                    carpma(a, b);
                    break;
                case 4:
                    bölme(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    area(a, b);
                    break;
                case 8:
                    cevre(a, b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdin.");
            }
        } while(secim != 0);

    }
}