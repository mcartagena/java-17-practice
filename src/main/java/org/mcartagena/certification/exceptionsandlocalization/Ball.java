package org.mcartagena.certification.exceptionsandlocalization;

class LostBallException extends Exception {
}

public class Ball {
    public void toss() throws LostBallException {
        var windUp = new int[1];
        System.out.println(windUp[1]);
    }

    public static void main(String[] bouncy) {
        try {
            new Ball().toss();
        } catch (Throwable e) {
            System.out.print("Caught!");
        }
    }
}
