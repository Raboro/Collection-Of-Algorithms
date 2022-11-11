package org.collectionofalgorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    @Test
    void testSearchForElementBestCaseInteger() {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            intList.add(i);
        }
        assertEquals(0, LinearSearch.searchForElement(intList.iterator(), 0));
    }

    @Test
    void testSearchForElementAverageCaseInteger() {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            intList.add(i);
        }
        assertEquals(1000, LinearSearch.searchForElement(intList.iterator(), 1000));
    }

    @Test
    void testSearchForElementWorstCaseInteger() {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            intList.add(i);
        }
        assertEquals(9999999, LinearSearch.searchForElement(intList.iterator(), 9999999));
    }

    @Test
    void testSearchForElementIntegerNull() {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            intList.add(i);
        }
        assertNull(LinearSearch.searchForElement(intList.iterator(), 1000000000));
    }

    @Test
    void testSearchForOptionalBestCaseInteger() {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            intList.add(i);
        }
        assertEquals(0, LinearSearch.searchForOptional(intList.iterator(), 0).get());
    }

    @Test
    void testSearchForOptionalAverageCaseInteger() {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            intList.add(i);
        }
        assertEquals(1000, LinearSearch.searchForOptional(intList.iterator(), 1000).get());
    }

    @Test
    void testSearchForOptionalWorstCaseInteger() {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            intList.add(i);
        }
        assertEquals(9999999, LinearSearch.searchForOptional(intList.iterator(), 9999999).get());
    }

    @Test
    void testSearchForOptionalIntegerOptionalEmpty() {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            intList.add(i);
        }
        assertFalse(LinearSearch.searchForOptional(intList.iterator(), 1000000000).isPresent());
    }

    @Test
    void testSearchForElementIndexBestCaseInteger() {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            intList.add(i);
        }
        assertEquals(0, LinearSearch.searchForElementIndex(intList.iterator(), 0));
    }

    @Test
    void testSearchForElementIndexAverageCaseInteger() {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            intList.add(i);
        }
        assertEquals(1000, LinearSearch.searchForElementIndex(intList.iterator(), 1000));
    }

    @Test
    void testSearchForElementIndexWorstCaseInteger() {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            intList.add(i);
        }
        assertEquals(9999999, LinearSearch.searchForElementIndex(intList.iterator(), 9999999));
    }

    @Test
    void testSearchForElementIndexIntegerZero() {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            intList.add(i);
        }
        assertEquals(0, LinearSearch.searchForElementIndex(intList.iterator(), 1000000000));
    }

    @Test
    void testSearchForOptionalIndexBestCaseInteger() {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            intList.add(i);
        }
        assertEquals(0, LinearSearch.searchForOptionalIndex(intList.iterator(), 0).get());
    }

    @Test
    void testSearchForOptionalIndexAverageCaseInteger() {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            intList.add(i);
        }
        assertEquals(1000, LinearSearch.searchForOptionalIndex(intList.iterator(), 1000).get());
    }

    @Test
    void testSearchForOptionalIndexWorstCaseInteger() {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            intList.add(i);
        }
        assertEquals(9999999, LinearSearch.searchForOptionalIndex(intList.iterator(), 9999999).get());
    }

    @Test
    void testSearchForOptionalIndexIntegerOptionalEmpty() {
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 100000000; i++) {
            intList.add(i);
        }
        assertFalse(LinearSearch.searchForOptionalIndex(intList.iterator(), 1000000000).isPresent());
    }
}