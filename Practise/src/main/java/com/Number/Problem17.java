package com.Number;

// Dry Run It
public class Problem17 {
    public static void main(String[] args){
        int n=19;
        while (n!=1 && n!=4){
            int sum=0;
            while (n>0){
                int digit=n%10;
                sum=sum+(digit*digit);
                n=n/10;
            }
            n=sum;
        }
       if(n==1){
           System.out.println("Happy Number");
       }else {
           System.out.println("Not Happy Number");
       }
    }
}
/*
*
What is a Happy Number?
Take a number and square each digit, then add them.

Keep doing this until you get 1.

If you get 1 → Happy Number ✅

Example: 19
Start with 19.

Step 1: Take each digit:

1² = 1
9² = 81
Add them:

1 + 81 = 82

Now we have 82.

Step 2:

8² + 2²

64 + 4 = 68

Now we have 68.

Step 3:

6² + 8²

36 + 64 = 100

Step 4:

1² + 0² + 0² = 1

We got 1 🎉

Therefore:

19 is a Happy Number ✅
* */