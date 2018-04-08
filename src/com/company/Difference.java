package com.company;

public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] a) {
        elements = a;
    }

    public void computeDifference() {
        int thisDiff=0;
        int temp = 0;
        for (int i=0; i<elements.length;i++) {
            for (int j=1;j<elements.length;j++) {
                temp = elements[i] - elements[j];

                if (temp<0) {
                    temp= temp*(-1);
                }

                if (temp>thisDiff) {
                    thisDiff=temp;
                }

            }
        }
        maximumDifference = thisDiff;
    }
}
