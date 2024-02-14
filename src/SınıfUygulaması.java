import java.util.Scanner;

public class SınıfUygulaması {
    public static void main(String[] args)
    {
        System.out.println("Sınıf belirleme programı");
        System.out.println("-------------------------");

        Scanner input = new Scanner(System.in);
        int vize,Final,ortalama;

        System.out.println("Vize notunuzu giriniz.");
        vize = input.nextInt();
        System.out.println("Final notunuzu giriniz.");
        Final = input.nextInt();

        ortalama = (vize*40/100 + Final*60/100);
        System.out.println("Sizin ortalamanız : "+ortalama);

        if(ortalama>= 90 )
        {
            System.out.println("A sınıfındasınız.");
            System.out.println("Oldukça başarılısın.");
        }
        else if(ortalama<90 && ortalama>= 75)
        {
            System.out.println("B sınıfındasınız.");
            System.out.println("Biraz daha çalışman lazım");
        }
        else if(ortalama<75 && ortalama >= 50 )
        {
            System.out.println("C sınıfındasınız.");
            System.out.println("Seneye telafi edersin.");
        }
        else
        {
            System.out.println("D sınıfındasınız.");
            System.out.println("Acilen valoyu bırakman lazım");
        }




    }
}