package homework7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
возрастания значений их длины.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите строку №" + (i + 1) + ":");
            strings[i] = scanner.nextLine();
        }

        Arrays.sort(strings, Comparator.comparingInt(String::length));

        System.out.println("Строки по возрастанию длины: ");
        for (int i = 0; i < strings.length; i++) {
            System.out.println((i + 1) + " "  + strings[i] + " Длина строки: " + strings[i].length());
        }

        scanner.close();
    }
}
