import java.util.Scanner;

public class ÇiftSayiBulma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı gir : ");
        int x = input.nextInt();

        for(int i = 1; i <= x; ++i) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
