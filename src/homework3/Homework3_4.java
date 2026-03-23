package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_4 {
    /*
пользователь с клавиатуры вводит размер массива
        (просто целое число). После того, как размер массива
        задан, заполнить его random().

        Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
        вывести сообщение, что их нет.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива:");
        int a = scanner.nextInt();
        int[] array = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Массив: " + Arrays.toString(array));

        int zero = 0;
        for (int i = 0; i < a; i++) {
            if (array[i] == 0) {
                zero++;
            }
        }
        if (zero > 0) {
            System.out.println("Нулевых элемментов: " + zero);
        }
        else
        {
            System.out.println("Нулевых эллементов нет.");
        }
    }
}
