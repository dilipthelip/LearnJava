package com.learnjava.datastructures.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by z001qgd on 5/21/17.
 */
public class JavaHeap {


    private static Integer[] heapArray;
    static List<Integer> heapArrayList;

    private static void siftUp(){

        int k = heapArrayList.size()-1;

        while(k >0){
            int p = (k-1)/2;
            Integer item =  heapArrayList.get(k);
            Integer parent =  heapArrayList.get(p);

            if(item.compareTo(parent) > 0){
                heapArrayList.set(k,parent);
                heapArrayList.set(p,item);

                k=p;
            }else{
                break;
            }

        }

    }

    public static void main(String[] args) {

        heapArray = new Integer[]{15,10,9,8,9,6,3,4,2,12};

        heapArrayList = Arrays.asList(heapArray);

        System.out.println("Before sort :  " + heapArrayList);
        JavaHeap.siftUp();
        System.out.println("After sort :  " + heapArrayList);


    }
}
