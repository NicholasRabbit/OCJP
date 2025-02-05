package com.ocjp.test.static_test;

import java.util.ArrayList;
import java.util.List;

public class TestStatic {

    {
        System.out.println("instance initializer block");

    }


    public static List data = new ArrayList();

    static List update(String[] strs)
    {
        for (String x : strs) {
            data.add(x);
        }

        return data;
    }

    public static void main(String[] args) {
        update(args);
        System.out.println(data);
    }

}
