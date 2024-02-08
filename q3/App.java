package q3;

public class App {
    // 3- Do-While ve While döngüsü nedir? Bununla ilgili örnek yapınız.

    public static void main(String[] args) {

        // Koşul sağlanmadığı için while hiç çalışmayacak.
        int i = 0;
        while (i < 0) {
            System.out.println("while " + (i + 1) + " kez çalıştı.");
        }

        // Koşul sağlanmasa bile do-while en az bir kere çalışacak.
        int j = 0;
        do {
            System.out.println("do-while " + (j + 1) + " kez çalıştı.");
        } while (j < 0);

    }
}