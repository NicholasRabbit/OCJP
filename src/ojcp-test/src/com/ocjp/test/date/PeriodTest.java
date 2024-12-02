package com.ocjp.test.date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {

    /*
    * See the comments in "Period".
    * */
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023, 12, 11);
        Period days = Period.ofDays(1);
        System.out.println(localDate.plus(days));
    }
}
