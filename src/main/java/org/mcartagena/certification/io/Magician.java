package org.mcartagena.certification.io;

import java.nio.file.*;

public class Magician {
    public String doTrick(Path path) {
        return path.subpath(2, 3)
                .getName(1)  // IllegalArgumentException
                .toAbsolutePath()
                .toString();
    }

    public static void main(String... cards) {
        final Magician m = new Magician();
        System.out.print(m.doTrick(
                Paths.get("/bag/of/tricks/.././disappear.txt")));
    }
}
