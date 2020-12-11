package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Find min value in array");
        int size;
        System.out.println("Enter size of array: ");
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        int array[] = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
        System.out.println("Array is: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        System.out.println("Min Value in array is: " + minValue(array));
    }

    public static int minValue(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }
}
