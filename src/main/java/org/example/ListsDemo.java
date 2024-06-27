package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListsDemo {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("purple");
        colors.add("yellow");

        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("blue"));
        System.out.println(colors.contains("yellow"));

        for (String color : colors){
            System.out.println(color);
        }

        List<String> immutableList = List.of(
                "blue",
                "yellow"
        );

    }
}
