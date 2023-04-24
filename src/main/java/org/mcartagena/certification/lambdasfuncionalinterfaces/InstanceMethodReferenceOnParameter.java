package org.mcartagena.certification.lambdasfuncionalinterfaces;

interface StringParameterChecker {
    boolean check(String text);
}

interface StringTwoParameterChecker {
    boolean check(String text, String prefix);
}

public class InstanceMethodReferenceOnParameter {
    public static void main(String[] args) {
        StringParameterChecker methodRef = String::isEmpty;
        StringParameterChecker lambda = s -> s.isEmpty();

        System.out.println(methodRef.check("Zoo"));   // false

        StringTwoParameterChecker methodRef1 = String::startsWith;
        StringTwoParameterChecker lambda1 = (s, p) -> s.startsWith(p);

        System.out.println(methodRef1.check("Zoo", "A"));  // false
    }
}
