import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.copyValueOf;
import static java.lang.String.valueOf;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Введите арифметическое выражение (пример: 2 + 2 или II + II)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String calc = calc(input);
        System.out.println("Ответ: " + calc);
        scanner.close();
    }

    public static String calc(String input) throws Exception {
        String[] s = input.split(" ");
        String num_1 = s[0];
        String num_2 = s[2];
        String znak = s[1];
        for (int i = 1; i <= 3; ) {
            if ((s.length == 3) & (znak.matches("^[-,+,*,/]+$"))) {
                if (num_1.matches("^[I,II,III,IV,V,VI,VII,VIII,IX,X]+$") & num_2.matches("^[I,II,III,IV,V,VI,VII,VIII,IX,X]+$")) {
                    return getRomeRusult(num_1, num_2, znak);
                } else {
                    return getResult(num_1, num_2, znak);
                }
            }
            throw new Exception();
        }
        return null;
    }

    static String getResult(String num_1, String num_2, String znak) throws Exception {
        int a = Integer.parseInt(num_1);
        int b = Integer.parseInt(num_2);
        if ((a >= 1 & a <= 10) & (b >= 1 & b <= 10)) {
            int res = 0;
            switch (znak) {
                case "-":
                    res = a - b;
                    break;
                case "+":
                    res = a + b;
                    break;
                case "*":
                    res = a * b;
                    break;
                case "/":
                    res = a / b;
                    break;
            }
            return Integer.toString(res);
        }
        throw new Exception();
    }

    static String getRomeRusult(String num_1, String num_2, String znak) throws Exception {
        String[] roman = {"Ну нет нуля в римских", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        String[] numRoman = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int a = Integer.parseInt(valueOf(Arrays.asList(numRoman).indexOf(num_1)));
        int b = Integer.parseInt(valueOf(Arrays.asList(numRoman).indexOf(num_2)));
        int total = 1;
        String s = "^[-,+,*,/]+$";
        if ((s.equals(znak))) ;
        {
            switch (znak) {
                case "-":
                    total = a - b;
                    break;
                case "+":
                    total = a + b;
                    break;
                case "*":
                    total = a * b;
                    break;
                case "/":
                    total = a / b;
                    break;
            }
            String totalRoman = copyValueOf(Arrays.asList(roman).get(total).toCharArray());
            return totalRoman;
        }
    }
}
