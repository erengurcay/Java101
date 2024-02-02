import java.util.Scanner;

public class ArtıkYılHesabı {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir yıl giriniz: ");
        int yıl = input.nextInt();
        if (yıl % 4 == 0) {
            if (yıl % 100 == 0) {
                if (yıl % 400 == 0) {
                    System.out.println("" + yıl + " Bir artık yıldır");
                } else {
                    System.out.println("" + yıl + " Bir artık yıl değildir");
                }
            } else {
                System.out.println("" + yıl + "bir artık yıldır");
            }
        } else {
            System.out.println("" + yıl + " Bir artık yıl değildir");
        }

    }
}