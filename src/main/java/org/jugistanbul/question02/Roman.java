package org.jugistanbul.question02;


/**
 * Altug Bilgin Altintas
 * <p>
 * Effective Java Workshop
 */

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/**
 * 1-  Measure the performance of the main() method in MICROSECONDS
 * 2 - Can you make isRomanNumeral() method faster ?
 */
public class Roman {


    private static final String ALPHA_NUMERIC_STRING = "!?&ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";



    static boolean isRomanNumeral(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$"); // 1848 μs
    }

    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");


    /*
    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();  // 1297 μs
    }
    */

    public static void main(String[] args) {
        Long start = System.nanoTime();
        System.out.println(isRomanNumeral("MCMLXXVI"));
        Long stop = System.nanoTime();
        System.out.println(TimeUnit.MICROSECONDS.convert((stop - start), TimeUnit.NANOSECONDS) + " μs.");

    }
}
