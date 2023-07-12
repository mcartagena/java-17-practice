package org.mcartagena.certification.collectionsandgenerics;

import java.util.ArrayDeque;

public class TestingArrayDeque {
    public static void main(String[] args) {
        var greetings = new ArrayDeque<String>();
        greetings.offerLast("hello");
        greetings.offerLast("hi");
        greetings.offerFirst("ola");

        System.out.println(greetings);

        greetings.pop();
        greetings.peek();

        System.out.println(greetings);

        while (greetings.peek() != null)
            System.out.print(greetings.pop());

        System.out.println("\n------------");

        var queue = new ArrayDeque<>();
        queue.offer("exelsior");
        queue.peekFirst();
        queue.addFirst("edwin");
        queue.removeLast();
        System.out.println(queue);
    }
}
