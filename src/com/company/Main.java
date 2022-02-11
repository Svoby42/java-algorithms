package com.company;

public class Main {

    public static void main(String[] args) {
        int[] pole = {1,2,3,4,5,6,7,98,465,3210,4784,84574};
        System.out.println(binarySearch(pole, 3210));
    }

    public static int binarySearch(int[] a, int hledane){
        int p = 0;
        int r = a.length-1;
        while(p <= r){
            int q = (p+r)/2;
            if(hledane > a[q]){
                p = q + 1;
            }
            else if(hledane < a[q]){
                r = q - 1;
            }
            else{
                return q;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] a, int x){
        int answer = -1;
        for(int i = 0; i < a.length; i++){
            if(a[i] == x){
                return i;
            }
        }
        return answer;
    }
}
