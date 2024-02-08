package q1;

import java.util.HashMap;
import java.util.Scanner;

public class App {

	/* 1- Switch case ile müşteriden alınan sipariş numarasına göre
	 hangi ürünün sipariş edildiğini belirleyen algoritma yazınız.
	 Input için Scanner kullanınız */

    public static void main(String[] args) {
        HashMap<Integer, String> orders = createOrders();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sipariş numarasını giriniz: ");
        String input = scanner.next();

        try {
            int orderNumber = Integer.parseInt(input);

            if (orders.containsKey(orderNumber))
                System.out.println(orderNumber + " numaralı siparişe ait ürünün adı: " + orders.get(orderNumber));
            else
                System.out.println(orderNumber + " numaralı sipariş bulunamadı.");
        } catch (NumberFormatException e) {
            System.out.println("Geçersiz bir sipariş numarası girildi.");
        }

        scanner.close();
    }

    private static HashMap<Integer, String> createOrders() {
        HashMap<Integer, String> orders = new HashMap<>();
        orders.put(1, "Kalem");
        orders.put(2, "Kitap");
        orders.put(3, "Cetvel Seti");
        orders.put(4, "Silgi");
        orders.put(5,  "Kitap Ayracı");
        return orders;
    }

}