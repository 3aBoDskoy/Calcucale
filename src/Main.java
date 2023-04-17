import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.copyValueOf;
import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        String num_1 = s[0];
        String num_2 = s[2];
        String znak = s[1];
        if ((s.length == 3) & (znak.matches("^[+,-,*,/]+$"))) {
            if (num_1.matches("^[I,II,III,IV,V,VI,VII,VIII,IX,X]+$") & num_2.matches("^[I,II,III,IV,V,VI,VII,VIII,IX,X]+$")) {
                System.out.println(getRomeRusult(num_1, num_2, znak));
            } else {
                System.out.println(getResult(num_1, num_2, znak));
            }
        }
        throw new Exception();
    }

    static int getResult(String num_1, String num_2, String znak) throws Exception {
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
            return res;
        }
        throw new Exception();
    }
    static String getRomeRusult(String num_1, String num_2, String znak) {
        String[] roman = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
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
