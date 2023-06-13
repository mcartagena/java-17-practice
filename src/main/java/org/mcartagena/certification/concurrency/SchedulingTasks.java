package org.mcartagena.certification.concurrency;

import java.util.concurrent.*;

public class SchedulingTasks {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Runnable task1 = () -> System.out.println("Hello Zoo");

        Callable<String> task2 = () -> "Monkey";

        ScheduledFuture<?> r1 = service.schedule(task1, 10, TimeUnit.SECONDS);
        ScheduledFuture<?> r2 = service.schedule(task2, 10, TimeUnit.SECONDS);

        try {
            System.out.println(r2.get());
        } catch (InterruptedException | ExecutionException e){
            System.out.println("Interrupted!");
        } finally {
            service.shutdown();
        }
    }
}
