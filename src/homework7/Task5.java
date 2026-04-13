package homework7;

import java.util.Scanner;

/*
Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo"
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            result = result + ch + ch;
        }

        System.out.println("Исходное слово: " + input);
        System.out.println("Дублированный вариант: " + result);

        scanner.close();
    }
}
