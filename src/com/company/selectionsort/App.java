package com.company.selectionsort;

public class App {

    public static void main(String[] args) {
        int[] myArray = selectionSort(new int[] {9,8,3,13,87,12,99});
        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
        System.out.println("--------------");
        swapInts(63, 27);

    }

    public static void swapInts(int x, int y){
        x = x + y; // x is equal to 90
        y = x - y; // y is equal to 27
        x = x - y;
        System.out.println("x: " + x + " | " + "y: " + y);
    }

    public static int[] selectionSort(int[] a){
        for(int i = 0; i < a.length; i++){
            int minimum = i;
            for(int j = i + 1; j < a.length; j++){
                if(a[j] < a[minimum]){
                    minimum = j;
                }
            }
            int temp = a[i];
            a[i] = a[minimum];
            a[minimum] = temp;
        }
        return a;
    }

}
