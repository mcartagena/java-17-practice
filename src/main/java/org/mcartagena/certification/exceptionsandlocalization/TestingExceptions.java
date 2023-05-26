package org.mcartagena.certification.exceptionsandlocalization;

public class TestingExceptions {
    public static void main(String[] args) {
        int a=0, b=0;

        try{
            System.out.println(a/b);
        } catch (RuntimeException e){
            System.out.println(-1);
        //} catch (ArithmeticException e){  // exception ArithmeticException has already been caught
        //    System.out.println(0);
        } finally {
            System.out.println("done");
        }
    }
}
