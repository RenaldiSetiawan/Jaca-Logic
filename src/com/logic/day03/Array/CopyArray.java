package com.logic.day03.Array;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        //1. ubah reference variable
        int[] list1 = { 1, 2, 3, 4, 5 };
        int[] list2 = { 5, 4, 3, 2, 1 };

        list2 = list1;
        displayArray(list2);

        //2. Gunakana iterasi
        int[] list3 = new int [list1.length];
        for (int i = 0; i < list3.length; i++) {
            list3[i] = list1[i];
        }

        //3. system arraycopy
        int[] list4 = new int [list2.length];
        System.arraycopy(list2, 0, list4, 0, list2.length);
        Arrays.sort(list4);
        displayArray(list4);
    }

    public static void displayArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        
    }
}
