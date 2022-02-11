package com.company.linkedlist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {
        int[] array = {1,5,9,12,19};
        ArrayList<Integer> list = new ArrayList();
        for(int i = array[0]; i <= array[array.length-1]; i++){
            System.out.print(i + " ");
            list.add(i);
        }

        for(int c : array){
            System.out.println(c);
            list.remove(list.indexOf(c));
        }

        System.out.println("Chybí prvky");
        for(int c : list){
            System.out.print(c + " ");
        }



    }

}
