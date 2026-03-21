package homework2;

import java.util.Scanner;

public class Homework2_3 {

    /* Составьте программу, выводящую на экран квадраты чисел от 10 до 20
включительно.
     */

    public static void main(String[] args) {
        for (int a = 10; a <= 20; a++){
            int square = a * a;

            System.out.println(a + " = " + square);
        }
    }
}
