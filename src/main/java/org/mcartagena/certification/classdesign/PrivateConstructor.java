package org.mcartagena.certification.classdesign;

public class PrivateConstructor {
    private PrivateConstructor(){
        System.out.println("PrivateConstructor");
    }

    public static void main(String[] args) {
        PrivateConstructor pv = new PrivateConstructor();
    }
}
