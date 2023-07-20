package org.mcartagena.certification.concurrency;

public class Speaking {
    void talk() {
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            System.out.println("How rude!");
        }
    }

    public static void main(String[] args) {
        var s = new Speaking();
        var t = new Thread(() -> s.talk());
        t.run();
        t.interrupt();
        t.interrupt();
        t.interrupt();
    }
}
