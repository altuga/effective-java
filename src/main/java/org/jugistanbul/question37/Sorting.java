package org.jugistanbul.question37;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 *  1 - How do you transform current Exception in to IndexOutOfBoundsException -
 *  Exception Translation :
 *  Convert LowerLevelException to HigherLevelException
 *
 * @param <E> Type of the Element
 */
public class Sorting<E> {

    private static List myList = new ArrayList();

    public E get(int index) throws Throwable{
        try {
            ListIterator<E> i = myList.listIterator();
            return i.next();
        } catch (IllegalStateException | NoSuchElementException ex) {
             throw new ArrayIndexOutOfBoundsException(ex.getMessage()).initCause(ex);
        }
    }

    public static void main(String[] args) throws Throwable{
        Sorting<String> sorting = new Sorting<String>();
        System.out.println(sorting.get(9));
    }


}
