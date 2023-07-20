package org.mcartagena.certification.concurrency;

import java.util.concurrent.*;

public class Athlete {
    int stroke = 0;

    public synchronized void swimming() {
        stroke++;
    }

    private int getStroke() {
        synchronized (this) {
            return stroke;
        }
    }

    public static void main(String... laps) {
        ExecutorService s = Executors.newFixedThreadPool(10);
        Athlete a = new Athlete();
        for (int i = 0; i < 1000; i++) {
            s.execute(() -> a.swimming());
        }
        s.shutdown();
        System.out.print(a.getStroke());

        /*
            The shutdown() method stops new tasks from being submitted but
            does not wait for previously submitted tasks to complete. Therefore,
            the result may output 0, 1000, or anything in between
         */
    }
}
