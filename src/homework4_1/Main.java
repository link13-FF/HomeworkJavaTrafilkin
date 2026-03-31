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
public class Main {
    public static void main(String[] args) {
        Credit_card creditCard1 = new Credit_card("Visa",1000);
        Credit_card creditCard2 = new Credit_card("MasterCard", 2000);
        Credit_card creditCard3 = new Credit_card("UnionPay", 3000);

        creditCard1.status();
        creditCard2.status();
        creditCard3.status();

        System.out.println();
        creditCard1.deposit(100);
        creditCard2.deposit(400);
        creditCard3.withdraw(3500);

        System.out.println();
        creditCard1.status();
        creditCard2.status();
        creditCard3.status();
        //Добавил двойную проверку статуса карт для наглядности результатов "до" и "после".
    }
}
