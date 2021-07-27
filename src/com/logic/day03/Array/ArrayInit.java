package com.logic.day03.Array;

public class ArrayInit {
    public static void main(String[] args) {
        int[] list = new int[3];

        list[0] = 5;
        list[1] = 4;
        list[2] = 9;

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }

        String[] mystring = { "Java", "JavaSpring", "JavaScript" };
        for (int i = 0; i < mystring.length; i++) {
            System.out.println(mystring[i] + " ");
        }
    }
}
