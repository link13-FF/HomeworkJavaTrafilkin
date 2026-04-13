package homework7;

import java.util.Scanner;

/*
Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
меньше средней, а также их длину
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку №1:");
        String string1 = scanner.nextLine();
        System.out.println("Введите строку №2:");
        String string2 = scanner.nextLine();
        System.out.println("Введите строку №3:");
        String string3 = scanner.nextLine();

        int totalLength = string1.length() + string2.length() + string3.length();
        double averageLength = (double) totalLength / 3;

        System.out.println("Средняя длина строк: " + averageLength);
        System.out.println("Строки меньше средней:");

        if (string1.length() < averageLength) {
            System.out.println(string1 + " длина: " + string1.length());
        }
        if (string2.length() < averageLength) {
            System.out.println(string2 + " длина: " + string2.length());
        }
        if (string3.length() < averageLength) {
            System.out.println(string3 + " длина: " + string3.length());
        }
        scanner.close();
    }
}
