package org.acalltoauction;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class classPracticeTwo {
    public static void main(String[] args) {
//        File file = new File("/home/malik/Documents/tecmalik/AuctionApp/acalltoauction/src/test/java/org/acalltoauction/ClassWorkTest.java");
//        System.out.println(file.isDirectory());
//
//        try {
//            Path paths = Paths.get("/home/malik/Documents/tecmalik/AuctionApp/acalltoauction/src/main/java/org/acalltoauction/services/malik.txt");
//            Files.deleteIfExists(paths);
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }

        File file = new File("/home/malik/Documents/tecmalik/AuctionApp/acalltoauction/src/main/java/org/acalltoauction/services/malik.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[5];
            int result = fileInputStream.read(bytes, 0, 5);
            System.out.println(Arrays.toString(bytes));
            String value = new String(bytes);
            System.out.println(value);
            System.out.println(result);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
