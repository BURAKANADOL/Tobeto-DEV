package q6;

public class App {
    // String metotlarını araştırınız. Her bir metot için örnek yapınız.

    public static void main(String[] args) {
        String metin = "Hello, world!";

        System.out.println("Karakter sayısını döndürür: " + metin.length());

        System.out.println("Baştaki ve sondaki boşlukları temizler: " + metin.trim());

        System.out.println("Belirtilen index'deki karateri döndürür: " + metin.charAt(0));

        System.out.println("Belirtilen index'den itibaren, kalan kısmı döndürür: " + metin.substring(5));

        System.out.println("İki metni birleştirir: " + metin.concat(" - Sami Ayaz"));

        System.out.println("solda belirtilen harfleri, sağda belirtilen harflerle değiştirir: " + metin.replace('e', 'a'));

        System.out.println("Bütün harfleri küçültür: " + metin.toLowerCase());
        System.out.println("Bütün harfleri büyültür: " + metin.toUpperCase());

        System.out.println("Metnin, belirtilen ifade ile başlayıp başlamadığını kontrol eder: " + metin.startsWith("Hello"));
        System.out.println("Metnin, belirtilen ifade ile bitip bitmediğini kontrol eder: " + metin.endsWith(metin));

        System.out.println("Metnin, belirtilen ifadeyi içerip içermediğini kontrol eder: " + metin.contains("world"));

        System.out.println("Metnin belirtilen ifade ile eşit olup olmadığını kontrol eder: " + metin.equals("Hello, world!"));
    }

}