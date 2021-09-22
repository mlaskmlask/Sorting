package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] notSortedAray = new int[10];
        Random random = new Random();

        for (int i = 0; i < notSortedAray.length; i++) {
            notSortedAray[i] = random.nextInt(100);
        }
        for (int i = 0; i < notSortedAray.length; i++) {
            System.out.print(notSortedAray[i] + " ");
        }
        System.out.println("");
        int[] sortedArray = new int[notSortedAray.length];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = -1;
        }
        sortedArray[0] = notSortedAray[0];
        //kolejne elementy nieposortowanej tablicy
        for (int i = 1; i < notSortedAray.length; i++) {
            //szukamy miejsca w "posortowanej" tablicy
            boolean flag = false;
            for (int j = 0; j < sortedArray.length; j++) {
                //czy znaleziono miejsce da nieposortowanego elementu
                if (notSortedAray[i] < sortedArray[j]) {
                    //jeżeli tak, to przesuwamy posortowane elementy
                    for (int n = sortedArray.length - 1; n > j; n--) {
                        sortedArray[n] = sortedArray[n - 1];
                    }
                    //wstawiamy nieposortowany element
                    sortedArray[j] = notSortedAray[i];
                    //przerywamy operację szukania miejsca dla nieposortowanego elementu
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                sortedArray[i] = notSortedAray[i];
            }
        }
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println("");
    }
}
