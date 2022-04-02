package task1;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        char[] symbol = inputLine .toCharArray();
        int summa = 0;
        for (int i = 0; i < symbol.length; i++) {
            if (symbol[i] <= '9' && symbol[i] >= '1') {
                summa = summa + Character.getNumericValue(symbol[i]);
            }
        }
        System.out.println(summa);
    }
}
