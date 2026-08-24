package com.Array;

public class Problem10 {
    public static void main(String[] args){
        int arr[]={1, 2, 3, 2, 4, 5, 3, 6, 2, 7};
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i]+":"+count);
        }
    }
}
// Not Completed Yet Do Using Array First Then By Hashset