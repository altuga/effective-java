package org.jugistanbul.question10;

import java.math.BigDecimal;

/**
 * Altug Bilgin Altintas
 *
 * Effective Java
 *
 *
 */
public class Avoid {

    public static void main(String[] args) {


        BigDecimal butcex = new BigDecimal("1.00");
        butcex.add(BigDecimal.valueOf(2));
        System.out.println(butcex);

        BigDecimal butce = new BigDecimal("1.00");
        butce = butce.add(BigDecimal.valueOf(2));
        System.out.println(butce);

    }
}