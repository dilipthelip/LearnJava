package com.learnjava.datastructures.heap;

import java.util.Arrays;

/**
 * Created by z001qgd on 5/21/17.
 */
public class JavaHeap_ProblemB {

    public static void main(String[] args) {
        Integer[] heapArray = new Integer[]{null,10,15,9};
        maxHeapify(heapArray,1);
    }

    private static void maxHeapify(Integer[] heapArray, int j) {

        int l = j + 1;
        int r = j + 2;
        int largest = 0;
        //\left(J);

        System.out.println(heapArray.length);

        //Left loop
        if (l <= heapArray.length && heapArray[l] > heapArray[j]) {
            largest = l;
        } else {
            largest = j;
        }

        //Right Loop
        if (r <= heapArray.length && heapArray[r] > heapArray[j]) {
            largest = r;
        }

        if(largest!=j){
            Integer[] finalArray = swap(largest,j,heapArray,l);
            System.out.println("Final Sorted Array : " + Arrays.asList(finalArray));

        }
    }

    private static Integer[] swap(int largest, int j,Integer[] heapArray,int l) {

        int temp = heapArray[j];

        heapArray[j] = heapArray[largest];
        heapArray[l] = temp;

        return heapArray;
    }
}
