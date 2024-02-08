package q4;

import java.util.Random;
import java.util.Scanner;

public class App {
	/* 4-Kullanıcının 1 ile 10 arasında rastgele bir sayıyı tahmin etmesini isteyen
	 ve doğru tahmin edene kadar devam eden bir program yazınız.
	 (While döngüsü ile yapınız ve rastgele sayı üretmek için Random sınıfını kullanınız) */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int rastgeleSayi = random.nextInt(10) + 2; // 1 ile 10 arasında rastgele sayı üretme

        System.out.println("1 ile 10 arasında bir sayıyı tahmin ediniz.");

        boolean dogruTahmin = false;

        while (!dogruTahmin) {
            System.out.print("Tahmininizi giriniz: ");
            String input = scanner.next();

            try {
                int tahmin = Integer.parseInt(input);
                if (tahmin == rastgeleSayi) {
                    System.out.println("Tebrikler! sayıyı tahmin ettiniz.");
                    dogruTahmin = true;
                } else {
                    System.out.println("Yanlış tahmin... tekrar deneyin.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lütfen 1 ile 10 arasında bir sayı giriniz.");
            }
        }

        scanner.close();
    }

}