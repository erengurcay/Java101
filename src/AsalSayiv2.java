import java.util.Scanner;

public class AsalSayiv2 {


    static boolean isPrime(int number, int i) {
        if (number <= 2) {
            return number == 2;
        } else if (number % i == 0) {
            return false;
        } else {
            return i * i > number ? true : isPrime(number, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Asal olup olmadığını kontrol etmek için bir sayı girin: ");
        int num = scanner.nextInt();
        scanner.close();
        boolean result = isPrime(num, 2);
        if (result) {
            System.out.println("" + num + " bir asal sayıdır.");
        } else {
            System.out.println("" + num + " bir asal sayı değildir.");
        }

    }
}