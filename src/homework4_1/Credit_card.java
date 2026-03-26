package homework4_1;
/*
Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке. Напишите
программу, которая создает три объекта класса CreditCard у которых заданы
номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и
снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
 */
public class Credit_card {
    String cardName;
    int balance;

    public Credit_card (String cardName, int balance) {
        this.cardName = cardName;
        this.balance = balance;
    }

    public void deposit(int a) {
            balance += a;
            System.out.println("Зачислено: " + a + " на " + cardName);
    }

    public void withdraw(int a) {
        balance -= a;
        System.out.println("Снято: " + a + " с " + cardName);
    }

    public void status() {
        System.out.println("Карта: " + cardName + " -" + " Текущий балланс: " + balance);
    }
}
