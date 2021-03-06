package com.learnjava.streams;

import org.springframework.util.StringUtils;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by z001qgd on 1/7/17.
 */
public class StreamsIterationCount {

    public static void main(String[] args) {

        List<String> strings = asList("foo", "bar", "gen", "baz");

        strings.stream().forEachOrdered(e -> System.out.println(strings.indexOf(e) + e));


        System.out.println(StringUtils.split("dilip.sundarraj@target.com,dilip.sundarraj@target.com",","));

    }



}
