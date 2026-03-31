package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_3 {
    /*
    пользователь с клавиатуры вводит размер массива
        (просто целое число). После того, как размер массива
        задан, заполнить его random().

        Найти индексы минимального и максимального элементов и вывести в консоль.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива:");
        int a = scanner.nextInt();
        int[] array = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = random.nextInt(1000);
        }
        System.out.println("Массив: " + Arrays.toString(array));
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < a; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Индекс min элемента: " + minIndex);
        System.out.println("Значение min элемента: " + array[minIndex]);
        System.out.println("Индекс max элемента: " + maxIndex);
        System.out.println("Значение max элемента: " + array[maxIndex]);
    }
}
