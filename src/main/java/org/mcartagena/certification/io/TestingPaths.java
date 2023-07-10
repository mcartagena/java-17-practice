package org.mcartagena.certification.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestingPaths {
    public static void main(String[] args) throws IOException {
        var p1 = Path.of("/tea/earlgrey/..", ".").resolve(Path.of("hot.txt"));
        var p2 = new File("/./tea/./earlgrey/./.././hot.txt").toPath();
        // System.out.print(Files.isSameFile(p1,p2));  // NoSuchFileException: /tea/earlgrey/.././hot.txt if the file doesn't exist
        System.out.print(" ");
        System.out.print(p1.normalize().equals(p2.normalize()));
        System.out.print(" ");
        //nSystem.out.print(Files.mismatch(p1,p2));  // NoSuchFileException: /tea/earlgrey/.././hot.txt if the file doesn't exist

        // true true -1 if the file exist

        var halleysComet = Path.of("stars/./rocks/../m1.meteor")
                .subpath(1, 5).normalize();

        var lexellsComet = Paths.get("./stars/../solar/");
        lexellsComet.subpath(1, 3)
                .resolve("m1.meteor").normalize();
        System.out.print(halleysComet.equals(lexellsComet) ?
                "Same!" : "Different!");

        // Different lexellsComet has missed the assigment and path is inmutable
    }
}
