package com.learnjava.list;

import java.util.ArrayList;
import java.util.List;

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
    }
}
