package com.example.algorithm_java.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("minha");
        list.add("kwon");

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


    }
}
