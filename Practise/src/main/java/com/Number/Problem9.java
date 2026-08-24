package com.Number;

public class Problem9 {
    public static void main(String[] args) {
        int n = 7;
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println(a);
    }
}
