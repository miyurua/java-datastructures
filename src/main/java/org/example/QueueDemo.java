package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
//        follows FIFO
//        eg - checkout counter at supermarket
        Queue<Person> supermarket = new LinkedList<>();

        supermarket.add(new Person("miur", 23));
        supermarket.add(new Person("alex", 24));
        supermarket.add(new Person("james", 19));

        System.out.println(supermarket.peek() + " " + supermarket.size());
        supermarket.poll();
        System.out.println(supermarket.peek() + " " + supermarket.size());

    }

    static record Person(String name, int age){}
}
