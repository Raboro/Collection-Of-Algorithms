package org.collectionofalgorithms;

import java.util.Iterator;
import java.util.Optional;

/**
 * <p>Class, which uses LinearSearch to collect the element or the index of the element to be searched for</p>
 * <p>Implements normal return of element or index as int or Optional</p>
 *
 * @author Marius Wörfel
 * @since 1.0-SNAPSHOT
 */
public class LinearSearch {

    /**
     * Searched element must be same Datatype as Iterator holds
     *
     * @param list     Insert any class, which implements Iterator as Iterator
     * @param searched Insert element to be searched for
     * @return searched element or null
     * @since 1.0-SNAPSHOT
     */
    public static <T> T searchForElement(Iterator<T> list, T searched) {
        while (list.hasNext()) {
            T element = list.next();
            if (element.equals(searched)) {
                return element;
            }
        }
        return null;
    }

    /**
     * Searched element must be same Datatype as Iterator holds
     *
     * @param list     Insert any class, which implements Iterator as Iterator
     * @param searched Insert element to be searched for
     * @return Optional of searched element
     * @since 1.0-SNAPSHOT
     */
    public static <T> Optional<T> searchForOptional(Iterator<T> list, T searched) {
        while (list.hasNext()) {
            T element = list.next();
            if (element.equals(searched)) {
                return Optional.of(element);
            }
        }
        return Optional.empty();
    }

    /**
     * Searched element must be same Datatype as Iterator holds
     *
     * @param list     Insert any class, which implements Iterator as Iterator
     * @param searched Insert element to be searched for
     * @return searched element index (int) or Zero
     * @since 1.0-SNAPSHOT
     */
    public static <T> int searchForElementIndex(Iterator<T> list, T searched) {
        int index = 0;
        while (list.hasNext()) {
            T element = list.next();
            if (element.equals(searched)) {
                return index;
            }
            index++;
        }
        return 0;
    }

    /**
     * Searched element must be same Datatype as Iterator holds
     *
     * @param list     Insert any class, which implements Iterator as Iterator
     * @param searched Insert element to be searched for
     * @return Optional of searched element index (int)
     * @since 1.0-SNAPSHOT
     */
    public static <T> Optional<Integer> searchForOptionalIndex(Iterator<T> list, T searched) {
        int index = 0;
        while (list.hasNext()) {
            T element = list.next();
            if (element.equals(searched)) {
                return Optional.of(index);
            }
            index++;
        }
        return Optional.empty();
    }
}