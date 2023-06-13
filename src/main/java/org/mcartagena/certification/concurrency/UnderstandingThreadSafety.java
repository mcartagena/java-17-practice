package org.mcartagena.certification.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class UnderstandingThreadSafety {
    // private int sheepCount = 0;  // not thread safety
    // private AtomicInteger sheepCount = new AtomicInteger(0);
    private int sheepCount = 0;

    private void incrementAndReport(){
        // System.out.print((++sheepCount) + " ");  // 7 8 3 2 1 6 9 5 4 1 number 1 is repeated
        // System.out.print(sheepCount.incrementAndGet() + " "); // 10 9 3 7 5 6 4 2 1 3 still unordered
        synchronized (this){
            System.out.print((++sheepCount) + " ");  // 1 2 3 4 5 6 7 8 9 10  ordered!
        }
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            var manager = new UnderstandingThreadSafety();
            for (int i=0; i<10; i++)
                    service.submit(
                            () -> manager.incrementAndReport()
                    );
        } finally {
            service.shutdown();
        }
    }
}
