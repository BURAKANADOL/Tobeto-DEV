package q7;
import java.util.Scanner;

public class App {
	/* 7- kullanıcıdan öğrenci sayısını isteyen her öğrenci için öğrenci adı,öğrenci soyadı,
	 1.sınav notu,2.sınav notu,3.sınav notu isteyen ve daha sonra not ortalamasını hesaplayıp
	 ekrana yazdıran algoritma yapınız.(For döngüsü kullanınız) */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrenci sayısını giriniz: ");
        String input = scanner.next();

        try {
            int ogrenciSayisi = Integer.parseInt(input);

            for (int i = 1; i <= ogrenciSayisi; i++) {
                System.out.println("\n" + i + ". öğrenci'nin bilgilerini giriniz:");

                System.out.print("Öğrenci Adı: ");
                String ad = scanner.next();

                System.out.print("Öğrenci Soyadı: ");
                String soyad = scanner.next();

                System.out.print("1. Sınav Notu: ");
                String s1Input = scanner.next();
                try {
                    double s1 = Double.parseDouble(s1Input);

                    System.out.print("2. Sınav Notu: ");
                    String s2Input = scanner.next();
                    try {
                        double s2 = Double.parseDouble(s2Input);

                        System.out.print("3. Sınav Notu: ");
                        String s3Input = scanner.next();

                        try {
                            double s3 = Double.parseDouble(s3Input);

                            double notOrtalamasi = (s1 + s2 + s3) / 3;

                            System.out.println("Not Ortalaması: " + notOrtalamasi);
                        } catch(NumberFormatException e) {
                            System.out.println("3. sınav notu geçersiz girildi.");
                        }
                    } catch(NumberFormatException e) {
                        System.out.println("2. sınav notu geçersiz girildi.");
                    }
                } catch(NumberFormatException e) {
                    System.out.println("1. sınav notu geçersiz girildi.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Geçersiz öğrenci sayısı girildi.");
        }

        scanner.close();
    }

}