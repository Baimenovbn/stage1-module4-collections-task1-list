package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> oddThenEven = new LinkedList<>();

        sourceList.forEach(num -> {
            if (num % 2 == 0) {
                oddThenEven.addLast(num);
            } else {
                oddThenEven.addFirst(num);
            }
        });


        return oddThenEven;
    }
}
