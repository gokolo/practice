package com.company;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Track number of elements swapped during a single array traversal
        int numberOfSwaps = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    swap(j, j + 1, a);
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                System.out.println("Array is sorted in "+numberOfSwaps +" swaps.");
                System.out.println("First Element: "+a[0]);
                System.out.println("Last Element: "+a[n-1]);
                break;
            }
        }
        if (numberOfSwaps > 0) {
            System.out.println("Array is sorted in "+numberOfSwaps +" swaps.");
            System.out.println("First Element: "+a[0]);
            System.out.println("Last Element: "+a[n-1]);
        }

    }

    private static void swap(int i, int i1, int[] a) {
        int temp = a[i];
        a[i] = a[i1];
        a[i1] = temp;
    }
}
