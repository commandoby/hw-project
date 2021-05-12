package HW_210507.Concurrency;

import java.util.concurrent.Semaphore;

public class Customer implements Runnable {
    JewerelyStore store;
    Semaphore semaphore;
    private final int id;
    private int patience;

    public Customer(JewerelyStore store, Semaphore semaphore, int id, int patience) {
        this.store = store;
        this.semaphore = semaphore;
        this.id = id;
        this.patience = patience;
    }

    @Override
    public void run() {
        try {
            while (patience > 0) {
                if (store.isOpenStore()) {
                    semaphore.acquire();
                    store.customerOn(id);
                    Thread.sleep(1000 + Math.round(Math.random() * 7000));
                    store.customerOff(id);
                    semaphore.release();
                    patience--;
                    if (store.isOpenStore()) store.storeWork();
                    if (patience > 0) { //курим на улице
                        Thread.sleep(3000 + Math.round(Math.random() * 3000));
                    }
                } else {
                    Thread.sleep(1000);
                }
            }
            System.out.println("Покупатель " + id + " ушёл обдумывать своё финансовое положение.");
        } catch (InterruptedException | CustomerOffException e) {
            e.printStackTrace(System.out);
        }
    }
}
