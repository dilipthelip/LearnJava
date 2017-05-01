package com.learnjava.list;

import jdk.nashorn.internal.ir.Optimistic;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by z001qgd on 1/25/17.
 */
public class ListTest {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("107825872452");
        stringList.add("107826579241");
        stringList.add("107826579378");

        String str = "szfskjdhfkajshdkjnakjdhas107825872452";

        if(stringList.stream().anyMatch(s->str.contains(s))){
            System.out.println("Inside match ");
        }

        List<String> stringList1 = new ArrayList<>();
        stringList1.add("dilip");
        if(!ObjectUtils.isEmpty(stringList1)){
            System.out.println("Inside if loop");
        }else{
            System.out.println("Inside else loop");
        }

        List list = Arrays.asList(null);
        System.out.println("list : " + list);

        Optional<String> empty = Optional.empty();
        System.out.println(empty.get());
    }
}
