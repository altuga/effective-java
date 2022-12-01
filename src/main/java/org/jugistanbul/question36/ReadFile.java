package org.jugistanbul.question36;

import java.io.*;
import java.util.Optional;


/**
 * Altug Bilgin Altintas
 * <p>
 * Effective Java Workshop
 * <p>

 * Twitter : @altugaltintas
 */


/*
TODO: 
 1 - What are the alternatives for copy() method
*/
public class ReadFile {

    private static final int BUFFER_SIZE = 8 * 1024;


    /**
     *
     * @param src
     * @param dst
     * @return
     */
    static Optional<Boolean> copy(String src, String dst) {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {

            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0) {
                out.write(buf, 0, n);
            }

            return Optional.of(true);
        } catch (IOException ex) {
            System.err.println(ex);
            return Optional.empty();
        }

    }

    public static void main(String[] args) throws IOException{
        String src = "a.txt"; // always gives error
        String dst = "b.txt"; // always gives error
        Optional<Boolean> result =  copy(src, dst);
        result.ifPresent(System.out::println);
    }
}
