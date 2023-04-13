import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.copyValueOf;
import static java.lang.String.valueOf;

public class Calc {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        String num_1 = s[0];
        String num_2 = s[2];
        String znak = s[1];
        if (s.length == 3)
            if (num_1.matches("^[I,II,III,IV,V,VI,VII,VIII,IX,X]+$") & num_2.matches("^[I,II,III,IV,V,VI,VII,VIII,IX,X]+$")) {
                System.out.println(getRomeRusult(num_1, num_2, znak));
            } else {
                System.out.println(getResult(num_1, num_2, znak));
            }
        return;
    }

    static int getResult(String num_1, String num_2, String znak) {
        int a = Integer.parseInt(num_1);
        int b = Integer.parseInt(num_2);
        if ((a >= 0 & a <= 10) & (b >= 0 & b <= 10)) {
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
        return -1;
    }

    static String getRomeRusult(String num_1, String num_2, String znak) {
        String[] roman = {"В римской системе нет нуля или отрицательных значений", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        int total = 1;
        switch (znak) {
            case "-":
                total = Integer.parseInt(valueOf(Arrays.asList(roman).indexOf(num_1))) - Integer.parseInt(valueOf(Arrays.asList(roman).indexOf(num_2)));
                break;
            case "+":
                total = Integer.parseInt(valueOf(Arrays.asList(roman).indexOf(num_1))) + Integer.parseInt(valueOf(Arrays.asList(roman).indexOf(num_2)));

                break;
            case "*":
                total = Integer.parseInt(valueOf(Arrays.asList(roman).indexOf(num_1))) * Integer.parseInt(valueOf(Arrays.asList(roman).indexOf(num_2)));
                break;
            case "/":
                total = Integer.parseInt(valueOf(Arrays.asList(roman).indexOf(num_1))) / Integer.parseInt(valueOf(Arrays.asList(roman).indexOf(num_2)));
                break;
        }
        String totalRoman = copyValueOf(Arrays.asList(roman).get(total).toCharArray());
        return totalRoman;
    }
}






















