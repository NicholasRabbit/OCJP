package com.ocjp.test.list;


import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class ListAndStringTest {

    /*
    * 1Z808 Q109
    * */
    @Test
    public void testAddSameElementsToList() {
        List<String> list = new ArrayList<>();
        list.add("SE");
        list.add("EE");
        list.add("ME");
        // Adding "SE" here will not replace the first "SE".
        // Because we can save duplicate elements in different positions of a list.
        list.add("SE");
        list.add("EE");

        list.remove("SE");

        System.out.println("Values are: " + list);
    }

    @Test
    public void testAddToASet() {
        Set<String> set = new HashSet<>();

        set.add("SE");
        set.add("EE");
        set.add("ME");

        // Duplicate elements are not allowed in a "Set" object.
        set.add("SE");
        set.add("EE");

        assertEquals(3, set.size());

    }



}