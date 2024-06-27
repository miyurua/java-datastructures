package org.example;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
//        initialising array with size
        String[] colors = new String[4];
        colors[0] = "blue";
        colors[1] = "green";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[1]);

//        initialising array with elements
        int[] nums = {1, 433, 33};

//        looping through the array
        for (int i=0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }
//        reverse loop
        for (int i=nums.length-1; i>=0; i--){
            System.out.println(nums[i]);
        }

//        enhanced for loop
        for (String color : colors){
            System.out.println(color);
        }
//        stream
        Arrays.stream(colors).forEach(System.out::println);
    }
}