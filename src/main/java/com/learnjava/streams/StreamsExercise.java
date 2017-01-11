package com.learnjava.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

/**
 * Created by z001qgd on 1/6/17.
 */
public class StreamsExercise {

    public static void main(String[] args) {

        List<String> strings = asList("foo", "bar","gen", "baz");

        Map<String,String> map = new HashMap<>();

        System.out.println("Strings are : "+ strings);

        /**
         * Iterate a list
         */
        strings.stream().forEach(System.out::println);

        /**
         * Filter a value in a list.
         */
        strings.stream().filter(str->str.equals("foo")).forEach(System.out::println);

        List<String> result = strings.stream().filter(str->!str.equals("foo")).collect(Collectors.toList());

       result.stream().forEach(System.out::println);

        Map<String, String> result1 = strings.stream()
                .collect(Collectors.toMap(Function.identity(), Function.identity()));

        System.out.println("Result 1 : " + "\n" + result1);
    }
}
