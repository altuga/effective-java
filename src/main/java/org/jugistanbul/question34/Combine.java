package org.jugistanbul.question34;


/*
TODO
 1 - Measure time in microseconds of String concatenation operation
 2 - What are the alternative approaches for String concatenation operation?
*/

import java.util.concurrent.TimeUnit;

public class Combine {

    public static void main(String[] args) {
        int count = 1000;
        String str = "";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        long startTime = System.nanoTime();
        for (int i = 0; i < count; i++) {
            //stringBuilder.append("core");
            //stringBuffer.append("core");
            //str = str + "core"; // String concatenation
        }

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("operator:" + + (TimeUnit.MICROSECONDS.convert(estimatedTime, TimeUnit.NANOSECONDS)));


    }
}
