package homework7;

import java.util.Scanner;

/*
Ввести 3 строки с консоли. Найти слово, состоящее только из различных
символов. Если таких слов несколько, найти первое из них.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку №1:");
        String string1 = scanner.nextLine();
        System.out.println("Введите строку №2:");
        String string2 = scanner.nextLine();
        System.out.println("Введите строку №3:");
        String string3 = scanner.nextLine();

        String result = null;
        String[] allStrings = {string1, string2, string3};

        for (int i = 0; i < allStrings.length; i++) {
            String word = allStrings[i];

            if (allUniqueSymbols(word)) {
                result = word;
                break;
            }
        }

        if (result != null) {
            System.out.println("Слово с уникальными символами: " + result);
            System.out.println(" Длина: " + result.length() + " символов");
        } else {
            System.out.println("Слов с уникальными символами не найдено");
        }
        scanner.close();
    }

    static boolean allUniqueSymbols(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
