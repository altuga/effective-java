package org.jugistanbul.question27;


import java.math.BigDecimal;


/*
TODO
   1 -  Should we check if m is null or not ? If Yes how ?

*/
public class BondCalculation {

    /**
     * Returns a BigDecimal whose value is (this mod m). This method
     * always returns a non-negative BigDecimal.
     *
     *
     * @param m the modulus, which must be positive
     * @return Calculated Money Value
     * @throws ArithmeticException if m is less than or equal to 0
     */
    public BigDecimal calculateTimeValueOfMoney(BigDecimal m) {



        assert m!= null;

        // ...

        // calculation
        return m.add(new BigDecimal(1));

    }

    public static void main(String[] args) {

        BondCalculation bondCalculation = new BondCalculation();

        bondCalculation.calculateTimeValueOfMoney(null);
    }


}