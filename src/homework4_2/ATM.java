package homework4_2;
/*
Создать класс, описывающий банкомат. Набор купюр, находящихся в
банкомате, должен задаваться тремя свойствами: количеством купюр
номиналом 20, 50 и 100. Сделать метод для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму денег, а
возвращает булевое значение - успешность выполнения операции. При
снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор с тремя параметрами
-количеством купюр каждого номинала
 */
public class ATM {
    int banknote20;
    int banknote50;
    int banknote100;

    public ATM(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public void addBanknote(int add20, int add50, int add100) {
        banknote20 += add20;
        banknote50 += add50;
        banknote100 += add100;
        int total = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
        System.out.println("Добавлены купюры: " + add20 + "x20, " + add50 + "x50, " + add100 + "x100. " + "Всего: " + total);
    }

    public boolean withdraw(int sumWithdraw) {
        int all = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
        if (sumWithdraw % 10 != 0) {
            System.out.println("Требуется снять " + sumWithdraw + " некорректная сумма");
            return false;
        }

        if (sumWithdraw / 30 != 10) { System.out.println("Требуется снять " + sumWithdraw + " некорректная сумма(20)");
            return false;
        }

        if (all < sumWithdraw) {
            System.out.println("Недостаточно купюр в банкомате");
            return false;
        }

        int need20 = 0, need50 = 0, need100 = 0;
        int sumNeed = sumWithdraw;

        need100 = Math.min(sumNeed / 100, banknote100);
        sumNeed -= need100 * 100;

        need50 = Math.min(sumNeed / 50, banknote50);
        sumNeed -= need50 * 50;

        need20 = Math.min(sumNeed / 20, banknote20);
        sumNeed -= need20 * 20;

        banknote20 -= need20;
        banknote50 -= need50;
        banknote100 -= need100;

        System.out.print("Снято " + sumWithdraw + " Выдано: ");
        if (need20 > 0) System.out.print(need20 + "x20, ");
        if (need50 > 0) System.out.print(need50 + "x50, ");
        if (need100 > 0) System.out.print(need100 + "x100. ");
        System.out.println();

        return true;
    }

    public void status() {
        int total = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
        System.out.println("Наличие купюр: 20×" + banknote20 + ", 50×" + banknote50 + ", 100×" + banknote100 + "." + " Всего: " + total);
    }
}


