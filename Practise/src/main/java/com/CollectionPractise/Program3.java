package com.CollectionPractise;
import java.util.*;

public class Program3 {
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(20);
        s.push(10);
        s.push(4);
        s.pop();
        Enumeration e=s.elements();
        List l=new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add("PD");

       // System.out.println(e.nextElement());
        Iterator itr=l.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Iterator HashCode: "+itr);
        System.out.println( s.search(20)) ;
        System.out.println(s);
    }
}
