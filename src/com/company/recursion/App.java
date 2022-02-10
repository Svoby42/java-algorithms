package com.company.recursion;

public class App {

    public static void main(String[] args) {
        reduceByOne(10);
        System.out.println(factorial(10));
    }

    public static int factorial(int n){
        if(n <= 1){
            System.out.println("does this happen " + n);
            return 1;
        }
        System.out.println("hhah " + n);
        return n*factorial(n-1);
    }

    public static void reduceByOne(int n){
        if(n >= 0) {
            reduceByOne(n - 1);
        }
        System.out.println("Completed Call: " + n);
    }

}
