package com.ocjp.test.string;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

// Q108
public class EqualAndString {

    private StringBuilder sb1;
    private String str1;

    @Before
    public void setUp() {
        sb1 = new StringBuilder("Duke");
        str1 = sb1.toString();
        String str2 = sb1.toString();
    }


    @Test
    public void testEqualOfString() {
        String str2 = str1;   // str1 and str2 have the same reference of an object.
        assertTrue(str1 == str2);
    }

    /*
     * Executing "new String(...)" creates a new object "str2" which has different reference and hashcode with "str1".
     * */
    @Test
    public void testNewString() {
        String str2 = new String(str1);
        assertFalse(str1 == str2);
    }

    /*
    * In "StringBuilder" the method "toString()" also return a new String object. See the source code in it.
    * */
    @Test
    public void testToString() {
        String str2 = sb1.toString();
        assertFalse(str1 == str2);
    }

}
