package task2;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        int inputNumber = 0;
        while (true){
            System.out.println("Введите целое число:");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                inputNumber = scanner.nextInt();
                break;
            } else {
                System.out.println("Вы ввели не целое число!");
            }
        }
        for (int d = 2; inputNumber > 1; d++) {
            if (inputNumber % d == 0) {
                inputNumber = inputNumber / d;
                for (int i = 0; inputNumber % d == 0; i++) {
                    inputNumber = inputNumber / d;
                }
                System.out.println(d);
            }
        }
    }
}
