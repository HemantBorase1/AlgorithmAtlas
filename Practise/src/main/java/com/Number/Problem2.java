package com.Number;

public class Problem2 {

    public static boolean isPalindrome(int n){
        int original=n;
        int rev=0;
        while(n!=0){
            rev=rev*10+(n%10);
            n/=10;
        }
        return rev==original;
    }

    public static void main(String[] args) {
        int n=121;
        if(isPalindrome(n)){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not Palindrome Number");
        }
    }
}
