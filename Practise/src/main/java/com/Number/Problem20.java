package com.Number;

public class Problem20 {

    public static int value(int n) {
        int ans = 0;
        while (n != 0) {
            ans += n % 10;
            n /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 1729;
        while (n >= 10) {
            n = value(n);
        }

        if (n == 1) {
            System.out.println("It's a Magic Number");
        } else {
            System.out.println("It's Not a Magic Number");
        }
    }
}
