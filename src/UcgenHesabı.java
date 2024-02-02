import java.util.Scanner;

public class UcgenHesabı {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.ci dik kenar uzunluğunuzu giriniz: ");
        double a = input.nextDouble();
        System.out.println("2.ci dik kenar uzunluğunuzu giriniz: ");
        double b = input.nextDouble();
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Hipotenüs uzunluğu : " + c);
        double cevre = a + b + c;
        double alan = a * b / 2.0;
        System.out.println("Cevre uzunluğu : " + cevre);
        System.out.println("Alan : " + alan);
    }
}