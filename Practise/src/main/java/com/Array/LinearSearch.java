package com.Array;

public class LinearSearch {
    public static void main(String[] args){
        int arr[]={1,3,42,71,33,0};
        int find=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(find==arr[i]){
                index=i;
                break;
            }
        }
        System.out.println(find+" Element is Found at Index Position: "+index);
    }
}
