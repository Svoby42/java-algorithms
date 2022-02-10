package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
