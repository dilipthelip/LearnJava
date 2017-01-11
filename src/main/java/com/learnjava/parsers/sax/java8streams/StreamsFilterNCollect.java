package com.learnjava.parsers.sax.java8streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by z001qgd on 12/14/16.
 */
public class StreamsFilterNCollect {

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("spring", "node", "mkyong");

        List<String> result = lines.stream()			//convert list to stream
                .filter(line -> !"mkyong". equals (line))	//filters the line, equals to "mkyong"
                .collect(Collectors.toList());			//collect the output and convert streams to a List

        result.forEach(System.out::println);

    }
}
