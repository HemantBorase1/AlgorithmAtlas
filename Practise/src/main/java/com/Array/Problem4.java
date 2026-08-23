package com.Array;

public class Problem4 {

    public static void main(String[] args){
        int arr[]={42, 2, 3, 56, 18, 73, 29, 64};
        int min=arr[0];
        int secondmin=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                secondmin=min;
                min=arr[i];
            } else if (arr[i]<secondmin && arr[i]!=min) {
                secondmin=arr[i];
            }
        }
        System.out.println(min+" "+secondmin);
    }
}
