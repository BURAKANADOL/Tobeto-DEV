package q2;

import java.util.HashMap;
import java.util.Scanner;

public class App {
	/* 2- kullanıcıdan kaç ürün almak istediğini soran,her ürünün fiyatını alarak
	 toplam alışveriş tutarını hesaplayan bir algoritma yazınız.
	 (Input için Scanner ve döngü için for döngüsü kullanınız) */

    public static void main(String[] args) {
        HashMap<String, Integer> products = createProducts();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç ürün almak istiyorsunuz: ");
        String input = scanner.next();

        try {
            int totalAmount = 0;
            int orderCount = Integer.parseInt(input);
            for (int i = 1; i <= orderCount; i++) {

                System.out.print(i + ". sırada almak istediğiniz ürünün adını giriniz: ");
                String productName = scanner.next();

                if (products.containsKey(productName))
                    totalAmount += products.get(productName);
            }

            System.out.println("Toplam sipariş tutarı: " + totalAmount);
        } catch (NumberFormatException e) {
            System.out.println("Geçersiz ürün miktarı girildi.");
        }

        scanner.close();
    }
    private static HashMap<String, Integer> createProducts() {
        HashMap<String, Integer> products = new HashMap<>();
        products.put("Kalem", 20);
        products.put("Kitap", 200);
        products.put("Cetvel Seti", 50);
        products.put("Silgi", 6);
        products.put("Kitap Ayracı", 15);
        return products;
    }

}