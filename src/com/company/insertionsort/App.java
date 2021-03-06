package com.company.insertionsort;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] pole = {45,1,2,9987,32,145,7,8,654};
        System.out.println(Arrays.toString(insertionSort(pole)));
    }

    public static int[] insertionSort(int[] a){
        for(int i = 1; i <= a.length-1; i++){
            int x = a[i];
            int j = i - 1;
            while(j >= 0 && a[j] > x){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = x;
        }
        return a;
    }

}
