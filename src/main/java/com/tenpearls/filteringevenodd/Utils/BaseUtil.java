package com.tenpearls.filteringevenodd.Utils;

public class BaseUtil {

    public static Boolean checkIfEven(Integer number) {
        return number % 2 == 0;
    }
    public static Boolean checkIfOdd(Integer number) {
        return number % 2 != 0;
    }
}
