import java.util.Scanner;

public class DizidekiSayilarinOrtalamasi {
    public static void main(String[] args) {
        int[] list = {14 , 15 , 3 , 5, 3 , 22 , 42 ,21, 27 };
        double sum = 0;
        for (int i = 0; i < list.length; i++){
            sum += list[i];

        }
        double ort = sum / list.length;
        System.out.println(ort);



    }
}

