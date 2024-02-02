import java.util.Scanner;

public class UcakBileti {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Km değerini giriniz");
        int km = input.nextInt();
        if (km > 0) {
            double brutfiyat = (double)km * 0.1;
            System.out.print("Yaşınızı Giriniz");
            int yas = input.nextInt();
            int tip;
            double netfiyat;
            if (yas >= 0 && yas <= 12) {
                netfiyat = brutfiyat - brutfiyat * 0.5;
                System.out.print("Lütfen Yolculuk tipini griniz 1= tek 2= gidiş dönüş ");
                tip = input.nextInt();
                if (tip == 1) {
                    netfiyat -= netfiyat * 0.2;
                    System.out.println("mesafe: " + km);
                    System.out.println("indrimsiz fiyat: " + brutfiyat);
                    System.out.println("yaş " + yas);
                    System.out.println("tutar: " + netfiyat);
                } else if (tip == 2) {
                    netfiyat -= netfiyat * 0.2;
                    System.out.println("mesafe: " + km);
                    System.out.println("indrimsiz fiyat: " + brutfiyat);
                    System.out.println("yaş " + yas);
                    System.out.println("tutar: " + netfiyat);
                }
            } else if (yas > 12 && yas < 24) {
                netfiyat = brutfiyat - brutfiyat * 0.5;
                System.out.print("Lütfen Yolculuk tipini griniz 1= tek 2= gidiş dönüş ");
                tip = input.nextInt();
                if (tip == 1) {
                    netfiyat -= netfiyat * 0.2;
                    System.out.println("mesafe: " + km);
                    System.out.println("indrimsiz fiyat: " + brutfiyat);
                    System.out.println("yaş " + yas);
                    System.out.println("tutar: " + netfiyat);
                } else if (tip == 2) {
                    netfiyat -= netfiyat * 0.2;
                    System.out.println("mesafe: " + km);
                    System.out.println("indrimsiz fiyat: " + brutfiyat);
                    System.out.println("yaş " + yas);
                    System.out.println("tutar: " + netfiyat);
                }
            } else if (yas >= 65) {
                netfiyat = brutfiyat - brutfiyat * 0.3;
                System.out.print("Lütfen Yolculuk tipini griniz 1= tek 2= gidiş dönüş ");
                tip = input.nextInt();
                if (tip == 1) {
                    netfiyat -= netfiyat * 0.2;
                    System.out.println("mesafe: " + km);
                    System.out.println("indrimsiz fiyat: " + brutfiyat);
                    System.out.println("yaş " + yas);
                    System.out.println("tutar: " + netfiyat);
                } else if (tip == 2) {
                    netfiyat -= netfiyat * 0.2;
                    System.out.println("mesafe: " + km);
                    System.out.println("indrimsiz fiyat: " + brutfiyat);
                    System.out.println("yaş " + yas);
                    System.out.println("tutar: " + netfiyat);
                }
            } else if (yas < 0) {
                System.out.print("Geçersiz bir yaş değeri girdiniz");
            }
        } else {
            System.out.print("Hatalı Bir ifade girdiniz");
        }

    }
}