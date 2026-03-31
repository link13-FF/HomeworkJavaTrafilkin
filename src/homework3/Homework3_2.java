package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_2 {
    /*
    пользователь с клавиатуры вводит размер массива
    (просто целое число). После того, как размер массива
    задан, заполнить его random().

    Найти минимальный - максимальный элементы и вывести в консоль.
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

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < a; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("min " + min);
        System.out.println("max " + max);
    }
}
