public class AsalSayi {
    public static void main(String[] args) {
        System.out.println("1 ile 100 arasındaki asal sayılar:");

        for(int sayi = 2; sayi <= 100; ++sayi) {
            boolean asalMi = true;

            for(int i = 2; (double)i <= Math.sqrt((double)sayi); ++i) {
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {
                System.out.print("" + sayi + " ");
            }
        }

    }
}