package org.mcartagena.certification.lambdasfuncionalinterfaces;

interface StringStart {
    boolean beginningCheck(String prefix);
}

interface  StringChecker {
    boolean check();
}

public class InstanceMethodReference {
    public static void main(String[] args) {
        var str = "Zoo";
        StringStart methodRef = str::startsWith;
        StringStart lambda = s -> str.startsWith(s);

        System.out.println(methodRef.beginningCheck("A"));  // false

        var str1 = "";
        StringChecker methodRef1 = str1::isEmpty;
        StringChecker lambda1 = () -> str1.isEmpty();

        System.out.println(methodRef1.check());  // true
    }
}
