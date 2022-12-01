package org.jugistanbul.question04;

import java.util.*;

/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 *
 */

/*
TODO: 
 1 - Run the app.
 2 - Any abnormality ? If yes try fix it - 5 mins
 3 - Instructor will show the solutions
 4 - Refactor and ask questions 
*/
public final class PhoneNumber {
    private final short areaCode, prefix, lineNum;

    public static final String TURKIYE_CODE = "+90";

    public static List<String> getCustomerPhoneNumbers() {
        int value = 0;
        System.out.println("");
        return  List.of("String");
    }

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix   = rangeCheck(prefix,   999, "prefix");
        this.lineNum  = rangeCheck(lineNum, 9999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }

    @Override
    public int hashCode() {
        return 42; // bunu yapmayın !!
    }

    @Override public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PhoneNumber)) // RTTI - Run Time Type Identification
            return false;
        PhoneNumber pn = (PhoneNumber)o; // downcasting
        return pn.lineNum == lineNum && pn.prefix == prefix
                && pn.areaCode == areaCode;
    }

    public static void main(String[] args) {

       // PhoneNumber.getCustomerPhoneNumbers();

        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(707, 867, 5309), "Jenny");
        System.out.println(m.get(new PhoneNumber(707, 867, 5309)));
    }
}