package com.company.recursion;

public class App {

    public static void main(String[] args) {
        reduceByOne(10);
        System.out.println(factorial(10));

        int[] pole = {1,2,3,4,15,16,69,82,97,844,1541,2054};

        System.out.println(recursiveLinearSearch(pole, 0, 1541));
    }

    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void reduceByOne(int n){
        if(n >= 0) {
            reduceByOne(n - 1);
        }
    }

    public static int recursiveLinearSearch(int[] a, int i, int x){
        if(i > a.length -1 ){
            return -1;
        }else if(a[i] == x){
            return i;
        }else{
            System.out.println("index at: " + i);
            return recursiveLinearSearch(a, i+1, x);
        }
    }

}
