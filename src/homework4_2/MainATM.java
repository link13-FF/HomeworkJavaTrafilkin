package homework4_2;

public class MainATM {
    public static void main(String[] args) {

        ATM Atm1 = new ATM(1, 1, 1);
        ATM Atm2 = new ATM(200, 300, 400);
        ATM Atm3 = new ATM(1, 3, 5);

        Atm1.status();
        Atm1.addBanknote(14, 55, 77);
        System.out.println(Atm1.withdraw(2570));
        Atm1.status();
        System.out.println();

        Atm2.status();
        Atm2.addBanknote(1, 3, 15);
        System.out.println(Atm2.withdraw(195));
        Atm2.status();
        System.out.println();

        Atm3.status();
        Atm3.addBanknote(2, 1, 1);
        System.out.println(Atm3.withdraw(70000));
        Atm3.status();
    }
}
