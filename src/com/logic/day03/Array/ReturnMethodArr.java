package com.logic.day03.Array;

public class ReturnMethodArr {
    public static void main(String[] args) {
        int[] myList = { 1, 2, 3, 4, 5, 6 }; 
        displayArray(myList);
        System.out.println();
        int[] reverse = reverse(myList); 
        displayArray(reverse);
    }

    //1. method return revers
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j=list.length-1; i < result.length; i++, j--) {
            result[j] = list[i];
        }

        return result;
    }

    //2. display array
    public static void displayArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
