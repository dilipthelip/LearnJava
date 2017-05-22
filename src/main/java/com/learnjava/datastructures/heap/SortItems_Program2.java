package com.learnjava.datastructures.heap;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by z001qgd on 5/21/17.
 */
public class SortItems_Program2 {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(new Integer[]{1, 3, 2, 6, 4, 5, 10, 9, 8, 7});

        System.out.println("Before Sort : " + list1);

        Collections.sort(list1); //O(n*log(n))

        System.out.println("Sorted Array : " + list1);

        List<Integer> list2 = Arrays.asList(new Integer[]{11, 13, 12, 16, 14, 15, 20, 19, 18,17});

        System.out.println("Before Sort : " + list2);

        Collections.sort(list2);//O(n*log(n))

        System.out.println("Sorted Array : " + list2);

        List<Integer> listFinal = new ArrayList<Integer>();

        listFinal.addAll(list1);
        listFinal.addAll(list2);

        Collections.sort(listFinal);//O(n*log(n))

        System.out.println("Final Sorted Combined List is : " + listFinal);

    }
}
