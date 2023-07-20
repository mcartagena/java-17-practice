package org.mcartagena.certification.classdesign;

public class TestingLocalRecords {
    public static void printLength() {
        record Earthworm(int length) {
            Earthworm {  // compact constructor
                length = 4;
            }
        }
        var worm = new Earthworm(6);
        System.out.println(worm.length());
    }

    public static void main(String[] args) {
        printLength();  // 4
    }
}
