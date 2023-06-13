package org.mcartagena.certification.concurrency;

public class DeamonThread {
    public static void pause(){
        // Defines the thread task
        try{
            Thread.sleep(10_000);  // wait for secods
        } catch (InterruptedException e){
            System.out.println("Thread finished!");
        }
    }

    public static void main(String[] args) {
        var job = new Thread(() -> pause());  // Create thread

        // job.setDaemon(true); // by default users thread are not deamons

        job.start();

        System.out.println("Main method finished!");
    }
}
