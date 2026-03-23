package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_7 {
    /*
пользователь с клавиатуры вводит размер массива
  (просто целое число). После того, как размер массива
  задан, заполнить его random().

  Имеется массив из неотрицательных чисел(любой). Представьте что массив
представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} - > 999). Задача
добавить единицу к этому “числу” и на выходе получить исправленный массив.
Массив не содержит нуля в начале, кроме самого числа 0.
Пример:
Input: [1,4,0,5,6,3]
Output: [1,4,0,5,6,4]
Input: [9,9,9]
Output: [1,0,0,0]
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
}
}
