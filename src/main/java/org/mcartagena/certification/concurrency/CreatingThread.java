package org.mcartagena.certification.concurrency;

public class CreatingThread {
    public static void main(String[] args) {
        new Thread(
                () -> System.out.print("Hello")
        ).start();
        System.out.println("World");

        Runnable printInventory = () -> System.out.print("Printing zoo inventory");
        Runnable printRecords = () -> {
            for(int i = 0; i<3;i++)
                System.out.println("Printing record: " + i);
        };

        System.out.println("begin");
        new Thread(printInventory).start();
        new Thread(printRecords).start();
        new Thread(printInventory).start();
        System.out.print("end");

        /*
        // this code is synchronous and not start a new thread
        System.out.println("begin");
        new Thread(printInventory).run();
        new Thread(printRecords).run();
        new Thread(printInventory).run();
        System.out.print("end");
         */
    }
}
