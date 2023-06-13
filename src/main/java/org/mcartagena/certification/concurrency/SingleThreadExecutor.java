package org.mcartagena.certification.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    public static void main(String[] args) {
        Runnable printInventory = () -> System.out.print("Printing zoo inventory");
        Runnable printRecords = () -> {
            for (int i = 0; i<3; i++)
                System.out.println("Printing recor: " + i);
        };

        ExecutorService service = Executors.newSingleThreadExecutor();

        try {
            System.out.println("begin");
            service.execute(printInventory);
            service.execute(printRecords);
            service.execute(printInventory);
            System.out.println("end");
        } finally {
            service.shutdown();
        }
    }
}
