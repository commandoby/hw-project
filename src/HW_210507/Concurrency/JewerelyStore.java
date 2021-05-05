package HW_210507.Concurrency;

public class JewerelyStore {
    private int persons;
    private int[] personsId;
    private boolean openStore;
    private boolean startStore;

    public JewerelyStore() {
        persons = 0;
        personsId = new int[]{0, 0, 0, 0, 0};
        openStore = true;
        startStore = true;
    }

    public boolean isOpenStore() {
        return openStore;
    }

    //метод работы магазина
    public void storeWork() {
        if (persons < 4 && !startStore) {
            openStore = false;
            System.out.println("Магазин закрылся на перерыв. Вход запрещен.");
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace(System.out);
            }
            System.out.println("Магазин возобновил работу.");
            openStore = true;
            startStore = true;
        }
    }

    //вход покупателя
    synchronized public void customerOn(int id) {
        persons++;
        if (persons >= 4) startStore = false;
        for (int i = 0; i < personsId.length; i++) {
            if (personsId[i] == 0) {
                personsId[i] = id;
                break;
            }
        }
        System.out.print("Покупатель " + id + " вошёл в магазин. ");
        print();
    }

    //выход покупателя
    synchronized public void customerOff(int id) throws CustomerOffException{
        if (persons <= 0) throw new CustomerOffException("В магазине уже никого нет.");
        persons--;
        for (int i = 0; i < personsId.length; i++) {
            if (personsId[i] == id) {
                personsId[i] = 0;
                break;
            }
        }
        System.out.print("Покупатель " + id + " вышел на улицу.  ");
        print();
    }

    //вывод состояния магазина
    public void print() {
        System.out.print("В магазине " + persons + " человек: ");
        for (int i : personsId) {
            if (i != 0) System.out.print(i + ", ");
        }
        System.out.println();
    }
}
