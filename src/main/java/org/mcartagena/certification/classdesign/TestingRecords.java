package org.mcartagena.certification.classdesign;

public class TestingRecords {
    public static void main(String[] args) {
        var mommy = new Crane(4, "Cammy");
        System.out.println(mommy.numberEggs());
        System.out.println(mommy.name());

        var father = new Crane(0, "Craig");
        System.out.println(father);

        var copy = new Crane(0, "Craig");
        System.out.println(copy);

        System.out.println(father.equals(copy));
        System.out.println(father.hashCode() + ", " + copy.hashCode());
    }
}
