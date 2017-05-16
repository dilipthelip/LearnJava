package com.learnjava.list;

import java.util.Arrays;
import java.util.List;

/**
 * Created by z001qgd on 5/5/17.
 */
public class ConvertToList {

    public static void main(String[] args) {

        String str = "1234,2345";
        String str2 = "";
        List<String> zipcodesList = Arrays.asList(str.split(","));
        System.out.println("zipcodesList : " + zipcodesList);

        List<String> zipcodesList1 = Arrays.asList(str2.split(","));
        System.out.println("zipcodesList1 : " + zipcodesList1);
    }

}
