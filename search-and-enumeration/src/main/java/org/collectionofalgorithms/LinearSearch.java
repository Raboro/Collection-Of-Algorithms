package org.collectionofalgorithms;

import java.util.Iterator;
import java.util.Optional;

public class LinearSearch {

    public static <T> T searchForElement(Iterator<T> list, T searched) {
        while (list.hasNext()) {
            T element = list.next();
            if (element.equals(searched)) {
                return element;
            }
        }
        return null;
    }

    public static <T> Optional<T> searchForOptional(Iterator<T> list, T searched) {
        while (list.hasNext()) {
            T element = list.next();
            if (element.equals(searched)) {
                return Optional.of(element);
            }
        }
        return Optional.empty();
    }

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