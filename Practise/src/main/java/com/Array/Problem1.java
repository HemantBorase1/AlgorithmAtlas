package com.Array;

public class Problem1 {

    public static void main(String[] args){
        int arr[]={42, 7, 3, 56, 18, 73, 29, 5, 64};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
