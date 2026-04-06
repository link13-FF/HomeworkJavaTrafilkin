package homework6;

import java.lang.reflect.Method;

/*Задача 1:
Создать класс с как минимум 4 разными методами, в каждом методе добавить
проверку на исключительные ситуации, используя:
1. try- catch
2. try-catch, где catch будет несколько
3. try -catch, с использованием multi - catch
4. try-catch-finally
Продемонстрировать обработку исключительных ситуаций на примерах
 */
public class Exceptions {
    public void Method_1() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
            System.out.println("Метод 1: ошибок нет.");
            System.out.println();
        } catch (ArithmeticException e) {
            System.out.println("Метод 1");
            System.out.println("Ошибка: деоение на ноль не возможно.");
        }
        System.out.println("Программа продолжает работать");
        System.out.println();
    }

    public void Method_2() {
        try {
            int[] array = {1, 2, 3, 4};
            array[5] = 1;
            System.out.println("Метод 2: ошибок нет.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Метод 2");
            System.out.println("Ошибка: индекс за пределами массива.");
        }
        catch (Exception e) {
            System.out.println("Метод 2");
            System.out.println("Другая ошибка.");
        }
        System.out.println("Программа продолжает работать");
        System.out.println();
    }

    public void Method_3() {
        try {
            int[] num = {1, 2, 3};
            int a = 10 / 0;
            System.out.println(num[10]);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Произошла типовая ошибка");
        }
        System.out.println("Программа продолжает работать");
        System.out.println();
    }

    public void Method_4() {
        try {
            int[] num = {1, 2, 3};
            System.out.println(num[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Произошла типовая ошибка");
        } finally {
            System.out.println("Finally выводится несмотря на то, что была ошибка");
        }
        System.out.println("Программа продолжает работать");
    }

    public static void main(String[] args) {
        Exceptions demo = new Exceptions();
        demo.Method_1();
        demo.Method_2();
        demo.Method_3();
        demo.Method_4();
    }
}
