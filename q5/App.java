package q5;

public class App {
    // 5- Bir sayının mükemmel sayı olup olmadığı kontrol eden algoritma yazınız.

    public static void main(String[] args) {
        int sayi = 5;
        boolean mukemmelSayiMi = mukemmelSayiMi(sayi);

        if (mukemmelSayiMi)
            System.out.println(sayi + " sayısı mükemmel bir sayıdır.");
        else
            System.out.println(sayi + " sayısı mükemmel bir sayı değildir.");
    }

    private static boolean mukemmelSayiMi(int sayi) {
        if (sayi <= 0) {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
            return false;
        }

        int toplam = 0;

        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        return toplam == sayi;
    }

}