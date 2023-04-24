package org.mcartagena.certification.lambdasfuncionalinterfaces;

interface EmptyStringCreator {
    String create();
}
interface StringCopier {
    String copy(String value);
}
public class MethodReferenceConstructor {
    public static void main(String[] args) {
        EmptyStringCreator methodRef = String::new;
        EmptyStringCreator lambda = () -> new String();

        var myString = methodRef.create();

        System.out.println(myString.equals("Snake"));  // false

        StringCopier methodRef1 = String::new;
        StringCopier lambda1 = x -> new String(x);

        var myString1 = methodRef1.copy("Zebra");

        System.out.println(myString1.equals("Zebra")); // true
    }
}
