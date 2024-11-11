package com.ocjp.test.loop;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoopTest {


    @Test
    public void testForLoop() {
        int a = 0, z = 10;
        while (a < z) {
            a++;
            --z;
        }
        assertEquals(5, a);
        assertEquals(5, z);
        System.out.println(a + ":" + z);
    }

}
