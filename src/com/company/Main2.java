package com.company;

import java.util.Random;

public class Main2 {
    //sortowanie przez wybieranie

    public static void main(String[] args) {
        int[] notSortedAray = new int[10];
        Random random = new Random();

        for (int i = 0; i < notSortedAray.length; i++) {
            notSortedAray[i] = random.nextInt(100);
            System.out.print(notSortedAray[i] + " ");
        }

        System.out.println();

        int[] sortedArray = new int[notSortedAray.length];

        for (int i = 0; i < sortedArray.length; i++) {
            int max = notSortedAray[0];
            int index = 0;

            for (int j = 1; j < notSortedAray.length; j++) {
                if (notSortedAray[j] > max) {
                    max = notSortedAray[j];
                    index = j;
                }
            }
            notSortedAray[index] = -1;
            sortedArray[i] = max;
        }
        for (int i = 0; i < notSortedAray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
}
