package com.String;

// Find shortest word
public class Problem22 {
    public static void main() {
        String str="I love Programming";
        String words[]=str.split(" ");
        int min=3;
        int index=0;
        for(int i=0;i<words.length;i++){
            int count=0;
            String word=words[i];
            for(int j=0;j<word.length();j++){
                count++;
            }
            if(count<min){
                min=count;
                index=i;
            }
        }
        System.out.println("Short Word in String: "+words[index]);
    }
}
