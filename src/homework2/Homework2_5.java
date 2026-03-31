package homework2;

import java.util.Scanner;

public class Homework2_5 {
    /*
    Напишите программу, где пользователь вводит любое целое положительное
число.

А программа суммирует все числа от 1 до введенного пользователем числа. Для
ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
пользователь не мог ввести некорректные данные
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число.");

        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (a > 0) {
                long sum = 0;
                for (int i = 1; i <= a; i++) {
                    sum += i;
                }
                System.out.println("Сумма чисел от 1 до " + a + " = " + sum);
            }
            else {
                System.out.println("Число не целое");
            }
        }
        else {
            System.out.println("Число не целое");
        }
    }
}
