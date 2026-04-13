package task2;
/*
Создать класс, который будет хранить в себе коллекцию с названиями
животных. Реализовать методы удаления и добавления животных по
следующим правилам: добавляется всегда в начало коллекции, а удаляется
всегда из конца. Показать работу объекта этого класса в main методе другого
класса.
 */
public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals();

        System.out.println("Добавление животных:");

        animals.add("Динозавр");
        animals.show();
        animals.add("Варан");
        animals.show();
        animals.add("Черепаха");
        animals.show();
        animals.add("Казуар");
        animals.show();

        System.out.println("Удаление животных");

        animals.remove();
        animals.show();
        animals.remove();
        animals.show();
        animals.remove();
        animals.show();
        animals.remove();
        animals.show();
        animals.remove();
    }
}
