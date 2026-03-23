package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_1 {
     /*
     пользователь с клавиатуры вводит размер массива
    (просто целое число). После того, как размер массива
    задан, заполнить его random().

     Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
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

        Arrays.sort(array);
        System.out.println("Массив в прямом порядке: " + Arrays.toString(array));

        for (int i = 0; i < a / 2; i++) {
            int b = array[a - 1 - i];
            array[a - 1 - i] = array[i];
            array[i] = b;
        }
        System.out.println("Массив в обратном порядке: " + Arrays.toString(array));
    }
}
