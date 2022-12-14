package org.jugistanbul.question11;

import java.io.*;

/**
 * Altug Bilgin Altintas
 * <p>
 * Effective Java Workshop
 * <p>
 * <p>
 * Twitter : @altugaltintas
 */

/*
TODO: 
 1 - Simply the code -  5 mins
 2 - Instructor will show the solutions
 3 - Refactor and ask questions 
*/
public class ReadAndWriteFile {

    private static final int BUFFER_SIZE = 8 * 1024;

    static void copy(String src, String dst) throws IOException {

        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst);) {


            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }

    public static void main(String[] args) throws IOException {
        String src = args[0];
        String dst = args[1];
        copy(src, dst);
    }
}