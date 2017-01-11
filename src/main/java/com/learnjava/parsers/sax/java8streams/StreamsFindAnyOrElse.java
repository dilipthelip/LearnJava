package com.learnjava.parsers.sax.java8streams;

import java.util.Arrays;
import java.util.List;

/**
 * Created by z001qgd on 12/14/16.
 */
public class StreamsFindAnyOrElse {

    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(new Person("mkyong", 20),
                new Person("michael", 21), new Person("lawrence", 23),new Person("michael", 21));

        Person result = persons.stream()
                .filter((x) -> "michael".equals(x.getName()) && 21==x.getAge())
                .findAny()
                .orElse(null);

        System.out.println("Result is : "+ result);
    }
}
