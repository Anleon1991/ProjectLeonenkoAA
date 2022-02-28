import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        int x = 0;
        while (true){
            System.out.println("Введите целое число:");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                break;
            } else {
                System.out.println("Вы ввели не целое число!");
            }
        }
        for (int d = 2; x > 1; d++) {
            if (x % d == 0) {
                x = x / d;
                for (int i = 0; x % d == 0; i++) {
                    x = x / d;
                }
                System.out.println(d);
            }
        }
    }
}
