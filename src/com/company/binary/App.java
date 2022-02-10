package com.company.binary;

public class App {

    public static void main(String[] args) {
        int[] pole = {1,2,3,4,15,16,69,82,97,844,1541,2054};

        System.out.println(binarySearch(pole, 2));

    }

    public static int binarySearch(int [] a, int x){
        int p = 0;
        int r = a.length-1;

        while(p <= r){
            int q = (p+r)/2;
            if(x < a[q]){
                r = q - 1;
            } else if(x > a[q]){
                p = q + 1;
            } else{
                return q;
            }
        }
        return -1;
    }
}