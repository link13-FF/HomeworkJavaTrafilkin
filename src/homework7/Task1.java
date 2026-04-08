package homework7;

import java.util.Scanner;

/*
Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку №1:");
        String string1 = scanner.nextLine();
        System.out.println("Введите строку №2:");
        String string2 = scanner.nextLine();
        System.out.println("Введите строку №3:");
        String string3 = scanner.nextLine();

        String shortest = string1;
        String longest = string1;

        if (string2.length() < shortest.length()) {
            shortest = string2;
        }
        if (string2.length() > longest.length()) {
            longest = string2;
        }
        if (string3.length() < shortest.length()) {
            shortest = string3;
        }
        if (string3.length() > longest.length()) {
            longest = string3;
        }

        System.out.println("Результат:");
        System.out.println("Самая короткая строка: " + shortest);
        System.out.println("Длина строки: " + shortest.length() + " символ(ов)");
        System.out.println("Самая длина строка: " + longest);
        System.out.println("Длина строки: " + longest.length() + " символов");

        scanner.close();
    }
}
