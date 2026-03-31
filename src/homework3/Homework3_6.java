package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_6 {
    /*
пользователь с клавиатуры вводит размер массива
     (просто целое число). После того, как размер массива
     задан, заполнить его random().

     Проверить, является ли массив возрастающей последовательностью (каждое
следующее число больше предыдущего).
  */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива:");
        int a = scanner.nextInt();
        int[] array = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = random.nextInt(5);
        }
        System.out.println("Массив: " + Arrays.toString(array));

        int b = 0;
        for (int i = 0; i < a - 1; i++) {
            if (array[i + 1] > array[i]) {
                b += 1;
            }
        }
        if (b == a - 1) {
            System.out.println("Массив является возрастающей последовательностью");
        }
        else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
    }
}
