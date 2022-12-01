package org.jugistanbul.question02;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 *
 */

/*
TODO 
 1 - Measure the performance of the main() method in MILLISECONDS
 2 - Discussion : Did you feel any abnormality about the performance ?
 3 - Instructor will show the solutions
 4 - Refactor
*/

public class Sum {
    static ArrayList<BigDecimal> resultList = new ArrayList<>();

    private static long sum() {
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i; // autoboxing  - new Long(i) - implicit
        return sum;
    }

    public static void main(String[] args) {
        long start = System.nanoTime(); // always use nanotTime for accuracy
        sum();
        long end = System.nanoTime();
        System.out.println(  TimeUnit.MILLISECONDS.convert( (end - start), TimeUnit.NANOSECONDS) +  " ms..");


        BigDecimal bigDecimal =  new BigDecimal("20160419080037963720");
        BigDecimal result = bigDecimal.subtract(new BigDecimal("10"));
        System.out.println(" " + result);

        Long longx =  Long.valueOf("2016041908003796372");
        System.out.println(" " + longx);
        resultList = null ;
        resultList = new ArrayList<>();

    }
}