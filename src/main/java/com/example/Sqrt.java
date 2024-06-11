package com.example;

public class Sqrt {

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 2;
        int end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((long) mid * mid == x) {
                return mid;
            }
            if ((long) mid * mid < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }
}
