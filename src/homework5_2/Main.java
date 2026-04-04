package homework5_2;
/*Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет

периметра(используя абстрактный класс/методы). Создать массив из 5 разных
фигур. Вывести на экран сумму периметра всех фигур в массиве
*/
public class Main {
    public static void main(String[] args) {

        Figure[] figure = new Figure[5];

        figure[0] = new Triangle(3, 4, 5);
        figure[1] = new Rectangle(5, 10);
        figure[2] = new Circle(7);
        figure[3] = new Triangle(6,8,11);
        figure[4] = new Rectangle(4,6);

        double sumPerimeter = 0;

        for (int i = 0; i < figure.length; i++) {
            sumPerimeter += figure[i].perimeter();
        }

        System.out.println("Сумма периметров: " + sumPerimeter);
    }
}
