package org.mcartagena.certification.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;

public class OrchestantingTasksWithCyclicBarrier {
    private void removeLions() {
        System.out.println("Removing lions");
    }

    private void cleanPen() {
        System.out.println("Cleaning the pen");
    }

    private void addLions() {
        System.out.println("Adding lions");
    }

    public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
        try {
            removeLions();
            c1.await();
            cleanPen();
            c2.await();
            addLions();
        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println("Handle exceptions here " + e.getMessage());
        }
    }

    /*
        With CyclicBarrier
            Removing lions
            Cleaning the pen
            Cleaning the pen
            Cleaning the pen
            Cleaning the pen
            *** Pen Cleaned!
            Adding lions
            Adding lions
            Adding lions
            Adding lions
     */
    /*
    public void performTask(){
        removeLions();
        cleanPen();
        addLions();
    }

        Without cyclicBarrier
            Removing lions
            Cleaning the pen
            Adding lions
            Removing lions
            Cleaning the pen
            Adding lions
            Removing lions
            Cleaning the pen
            Adding lions
            Removing lions
            Cleaning the pen
            Adding lions
     */
    public static void main(String[] args) {
        var service = Executors.newFixedThreadPool(4);
        try {
            var manager = new OrchestantingTasksWithCyclicBarrier();
            var c1 = new CyclicBarrier(4);
            var c2 = new CyclicBarrier(4, () -> System.out.println("*** Pen Cleaned!"));
            for (int i = 0; i < 4; i++)
                service.submit(
                        () -> manager.performTask(c1, c2)
                );
        } finally {
            service.shutdown();
        }
    }
}
