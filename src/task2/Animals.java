package task2;

import java.util.LinkedList;

/*
Создать класс, который будет хранить в себе коллекцию с названиями
животных. Реализовать методы удаления и добавления животных по
следующим правилам: добавляется всегда в начало коллекции, а удаляется
всегда из конца. Показать работу объекта этого класса в main методе другого
класса.
 */
public class Animals {
    private LinkedList<String> animals = new LinkedList<>();

    public void add(String animal) {
        animals.addFirst(animal);
        System.out.println("Добавлено: " + animal);
    }
    public void remove() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция пустая, удалить невозможно");
            return;
        }
        String removed = animals.removeLast();
        System.out.println("Удалено: " + removed);
    }
    public void show() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция пустая");
            return;
        }
        System.out.println("Животные в коллекции: " + animals);
    }
}
