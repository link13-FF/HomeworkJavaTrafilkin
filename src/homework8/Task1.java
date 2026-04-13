package homework8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Задача 1:
Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран.
При решении использовать коллекции.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите набор чисел через запятую. Например: \"1, 2, 3, 4, 4, 5\"");

        String input = scanner.nextLine();
        String[] numbersArray = input.split(",");
        Set<String> uniqueNumbers = new HashSet<>(Arrays.asList(numbersArray));
        System.out.print("Результат без дублей: ");
        System.out.println(String.join(", ", uniqueNumbers));
        scanner.close();
    }
}
