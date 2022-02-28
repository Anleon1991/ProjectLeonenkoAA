import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task3 {
    public static void main(String[] args) {
        String str = "";
        while (true){
            boolean chek = true;
            System.out.println("Введите слова через пробел(русскими буквам):");
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            Pattern pattern = Pattern.compile("[a-zA-Z]");
            Matcher m = pattern.matcher(str);
            while (m.find()) {
                chek = false;
            }
            if (chek){
                System.out.println("Все четко!");
                break;
            } else {System.out.println("хуйня, давай по новой");}
        }
        String[] words = str.split(" ");
        int[] count = new int[words.length];



        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "Выберете пункт меню:\n" +
                            "0. выйти\n" +
                            "1. Вывести количество глассных в словах\n" +
                            "2. Вывести отсортировоный по колличеству гласных список слов\n" +
                            "3. Сделать первую гласную букву в каждом слове заглавной\n" +
                            ": "
            );
            int choice = sc.nextInt();
            if (choice == 0)
                break;
            if (choice < 1 || choice > 4) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }
            switch (choice) {
                case 1:
                    countOperation(str, count, words);
                    break;
                case 2:
                    sortOperation(str, count, words);
                    break;
                case 3:
                    System.out.println(mainOperation(str, count));
                    break;

            }
        }
    }

    public static String mainOperation(String str, int [] count){
        String[] words = str.split(" ");
        Pattern p = Pattern.compile("[АОУЭИЫЕЁЯЮаоуэиыеёяю]");
        for (int i = 0; i < words.length; i++) {
            Matcher mm = p.matcher(words[i]);
            Matcher mth = Pattern.compile("[аоуэиыеёяю]").matcher(words[i]);
            StringBuffer strb = new StringBuffer();
            while (mm.find()) {
                count[i]++;
            }
            while (mth.find()) {
                str = str.replaceFirst(mth.group(), mth.group().toUpperCase());
                break;
            }

        }
        return str;
    }

    public static void countOperation(String str, int [] count, String [] words){
        mainOperation(str, count);
        for (int i = 0; i  < words.length; i++){
            System.out.println(words[i] + " - " + count[i]);
        }
    }


    public static void sortOperation(String str, int [] count, String [] words) {
        mainOperation(str, count);
        for (int i = 0; i < count.length - 1; i++) {
            for (int j = i+1; j < count.length; j++) {
                if (count[i] < count[j]) {
                    int buf = count[i];
                    count[i] = count[j];
                    count[j] = buf;
                    String sbuf = words[i];
                    words[i] = words[j];
                    words[j] = sbuf;
                }
            }
        }
        System.out.println(Arrays.toString(words));
    }
}
