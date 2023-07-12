package com.example.algorithm_java.linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        ListIterator<Integer> iter = list.listIterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");

        }

        while (iter.hasPrevious()) {
            System.out.print(iter.previous() + " ");

        }
    }
}
