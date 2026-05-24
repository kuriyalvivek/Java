package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterService {

    public static void main(String[] args) {

        ExecutorService executorService =   Executors.newFixedThreadPool(10) ;

            for (int i = 0; i < 100; i++) {

                numberPrecess nm = new numberPrecess(i);

                executorService.submit(nm);
            }

            executorService.shutdown();

    }
}