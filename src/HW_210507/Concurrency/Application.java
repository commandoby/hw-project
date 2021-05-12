package HW_210507.Concurrency;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Application {
    public static void main(String[] args) {
        Random random = new Random();
        JewerelyStore store = new JewerelyStore();
        //не более 5 человек в магазине
        Semaphore semaphore = new Semaphore(5);
        //8 человек внутри и снаружи магазина
        ExecutorService executorService = Executors.newFixedThreadPool(8);

        for (int i = 0; i < 15; i++) {
            executorService.submit(new Customer(store, semaphore, i + 10, 2 + random.nextInt(3)));
        }

        executorService.shutdown();
    }
}
