package org.jugistanbul.question42;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;

/**
 * TODO:
 * - Throwing IOException is okay?
 */
public class Supply {

    static Optional<String> firstLineOfFile(String path) {

        try (BufferedReader br = new BufferedReader(new FileReader(path));) {
            return Optional.of(br.readLine());
        } catch (IOException ex) {
            ex.printStackTrace();
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
        String path = "a.txt";

        System.out.println(firstLineOfFile(path));

    }

}
