package com.Array;

/**
 * Linear Search
 *
 */

public class Problem11 {
    public static void main(String[] args){
        int arr[]={10,20,30,40,45};
        int found=45;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(found==arr[i]){
                index=i;
                break;
            }
        }
        System.out.println(found+" Element Found at Index:"+index);
    }
}
