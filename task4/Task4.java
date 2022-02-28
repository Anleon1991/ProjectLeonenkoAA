package task4;

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
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
        String s = Integer.toString(x);
        int[] symbol = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            symbol[i] = x % 10;
            x /= 10;
        }

        int maxIndex = searchMaxIndex(symbol);

        String[] chislo = new String[7];
        for (int i = 0; i < 7; i++ ){
            chislo[i] = str(symbol, i, maxIndex);
        }
        for (int i = 0; i < 7; i++){
            System.out.println(chislo[i]);
        }

    }

    static String str(int symbol[], int a, int maxIndex){
        String[] one = new String[]{"  *   ", " **   ", "* *   ", "  *   ", "  *   ", "  *   "," ***  "};
        String[] two = new String[]{" ***  ", "*   * ", "   *  ", "  *   ", " *    ", "*     ", "***** "};
        String[] three = new String[]{" ***  ", "*   * ", "   *  ", " **   ", "   *  ", "*   * ", " ***  "};
        String[] four = new String[]{"   *  ", "  **  ", " * *  ", "*  *  ", "***** ", "   *  ", "   *  "};
        String[] five = new String[]{"***** ", "*     ", "***   ", "   *  ", "    * ", "   *  ", "***   "};
        String[] six = new String[]{" ***  ", "*   * ", "*     ", "****  ", "*   * ", "*   * ", " ***  "};
        String[] seven = new String[]{"***** ", "    * ", "   *  ", "  *   ", " *    ", "*     ", "*     "};
        String[] eight = new String[]{" ***  ", "*   * ", "*   * ", " ***  ", "*   * ", "*   * ", " ***  "};
        String[] nine = new String[]{" **** ", "*   * ", "*   * ", " **** ", "    * ", "    * ", "    * "};
        String[] zero = new String[]{" ***  ", "*   * ", "*   * ", "*   * ", "*   * ", "*   * ", " ***  "};

        String chislo = "";
        for (int i = 0; i < maxIndex; i++){
            if(symbol[i] == 1){
                chislo += one[a] ;
            } else if(symbol[i] == 2){
                chislo += two[a] ;
            } else if(symbol[i] == 3){
                chislo += three[a];
            } else if(symbol[i] == 4){
                chislo += four[a];
            } else if(symbol[i] == 5){
                chislo += five[a];
            } else if(symbol[i] == 6){
                chislo += six[a];
            } else if(symbol[i] == 7){
                chislo += seven[a];
            } else if(symbol[i] == 8){
                chislo += eight[a];
            } else if(symbol[i] == 9){
                chislo += nine[a];
            } else if(symbol[i] == 0){
                chislo += zero[a];
            }

        }

        chislo = strMax(symbol, a, maxIndex, chislo );

        for (int i = maxIndex + 1; i < symbol.length; i++){
            if(symbol[i] == 1){
                chislo += one[a] ;
            } else if(symbol[i] == 2){
                chislo += two[a] ;
            } else if(symbol[i] == 3){
                chislo += three[a];
            } else if(symbol[i] == 4){
                chislo += four[a];
            } else if(symbol[i] == 5){
                chislo += five[a];
            } else if(symbol[i] == 6){
                chislo += six[a];
            } else if(symbol[i] == 7){
                chislo += seven[a];
            } else if(symbol[i] == 8){
                chislo += eight[a];
            } else if(symbol[i] == 9){
                chislo += nine[a];
            } else if(symbol[i] == 0){
                chislo += zero[a];
            }

        }

        return chislo;
    }

    static String strMax(int symbol[], int a, int maxIndex, String chislo){
        String[] oneMax = new String[]{"  1   ", " 11   ", "1 1   ", "  1   ", "  1   ", "  1   "," 111  "};
        String[] twoMax = new String[]{" 222  ", "2   2 ", "   2  ", "  2   ", " 2    ", "2     ", "22222 "};
        String[] threeMax = new String[]{" 333  ", "3   3 ", "   3  ", " 33   ", "   3  ", "3   3 ", " 333  "};
        String[] fourMax = new String[]{"   4  ", "  44  ", " 4 4  ", "4  4  ", "44444 ", "   4  ", "   4  "};
        String[] fiveMax = new String[]{"55555 ", "5     ", "555   ", "   5  ", "    5 ", "   5  ", "555   "};
        String[] sixMax = new String[]{" 666  ", "6   6 ", "6     ", "6666  ", "6   6 ", "6   6 ", " 666  "};
        String[] sevenMax = new String[]{"77777 ", "    7 ", "   7  ", "  7   ", " 7    ", "7     ", "7     "};
        String[] eightMax = new String[]{" 888  ", "8   8 ", "8   8 ", " 888  ", "8   8 ", "8   8 ", " 888  "};
        String[] nineMax = new String[]{" 9999 ", "9   9 ", "9   9 ", " 9999 ", "    9 ", "    9 ", "    9 "};
        String[] zeroMax = new String[]{" 000  ", "0   0 ", "0   0 ", "0   0 ", "0   0 ", "0   0 ", " 000  "};
        if(symbol[maxIndex] == 1){
            chislo += oneMax[a] ;
        } else if(symbol[maxIndex] == 2){
            chislo += twoMax[a] ;
        } else if(symbol[maxIndex] == 3){
            chislo += threeMax[a];
        } else if(symbol[maxIndex] == 4){
            chislo += fourMax[a];
        } else if(symbol[maxIndex] == 5){
            chislo += fiveMax[a];
        } else if(symbol[maxIndex] == 6){
            chislo += sixMax[a];
        } else if(symbol[maxIndex] == 7){
            chislo += sevenMax[a];
        } else if(symbol[maxIndex] == 8){
            chislo += eightMax[a];
        } else if(symbol[maxIndex] == 9){
            chislo += nineMax[a];
        } else if(symbol[maxIndex] == 0){
            chislo += zeroMax[a];
        }

        return chislo;
    }

    static int searchMaxIndex(int [] symbol){
        int maxIndex = 0;
        int maxNumber = 0;

        for (int i = 0; i < symbol.length; i++) {
            if(maxNumber <= symbol[i]){
                maxNumber = symbol[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
