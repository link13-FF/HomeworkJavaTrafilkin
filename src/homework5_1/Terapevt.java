package homework5_1;

public class Terapevt extends Doctor {

    @Override
    public void heal() {
        System.out.println("Терапевт лечение");
    }

    public void assing (Client client) {
        int heal = client.healCode;
        System.out.println("План лечения № " + heal);

        Doctor assing;

        if (heal == 1) {
            assing = new Hirurg();
            System.out.println("Назначен хирург");
        }
        else if (heal == 2) {
            assing = new Dantist();
            System.out.println("Назначен Дантист");
        }
        else {
            assing = new Terapevt();
            System.out.println("Назначен терапевт");
        }
        assing.heal();
    }
}
