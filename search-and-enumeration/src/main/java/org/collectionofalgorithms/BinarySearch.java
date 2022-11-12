package org.collectionofalgorithms;

import java.util.List;
import java.util.Optional;

/**
 * <p>Class, which uses Binary Search to collect the element of the element to be searched for</p>
 * <p>Implements normal return of element or Optional</p>
 *
 * @author Marius Wörfel
 * @since 1.0-SNAPSHOT
 */
public class BinarySearch {

    /**
     * Searched element must be same Datatype as list holds
     *
     * @param list     Insert any class which extends abstract class Number
     * @param searched Insert element to be searched for
     * @return searched element or null
     * @since 1.0-SNAPSHOT
     */
    public static <T extends Number> T searchForElement(List<T> list, T searched) {
        if (list.size() == 1 && !list.get(0).equals(searched)) {
            return null;
        }
        return getElement(list, searched);
    }

    private static <T extends Number> T getElement(List<T> list, T searched) {
        T middleValue = list.get(list.size() / 2);
        if (searched.equals(middleValue)) {
            return middleValue;
        } else if (searched.intValue() > middleValue.intValue()) {
            return searchForElement(list.subList(list.size() / 2, list.size()), searched);
        }
        return searchForElement(list.subList(0, list.size() / 2), searched);
    }

    /**
     * Searched element must be same Datatype as list holds
     *
     * @param list     Insert any class which extends abstract class Number
     * @param searched Insert element to be searched for
     * @return Optional of searched element
     * @since 1.0-SNAPSHOT
     */
    public static <T extends Number> Optional<T> searchForOptional(List<T> list, T searched) {
        if (list.size() == 1 && !list.get(0).equals(searched)) {
            return Optional.empty();
        }
        return getOptional(list, searched);
    }

    private static <T extends Number> Optional<T> getOptional(List<T> list, T searched) {
        T middleValue = list.get(list.size() / 2);
        if (searched.equals(middleValue)) {
            return Optional.of(middleValue);
        } else if (searched.intValue() > middleValue.intValue()) {
            return searchForOptional(list.subList(list.size() / 2, list.size()), searched);
        }
        return searchForOptional(list.subList(0, list.size() / 2), searched);
    }
}